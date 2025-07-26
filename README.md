# Zano DEX Trading (market making) bot

This trading bot sells tokens on the Zano DEX. The intent for this bot is to provide instant trading capabilities via the DEX for market makers who wishes to sell their tokens.

This bot will not mint/issue new tokens on the fly, but only offer what's available in the wallets of the bot.

The steps for setting up and running this bot are these:

* Setup and sync the latest Zanod (zano blockchain node)
* Create and connect an instance zano simplewallet to the main zanod node
* Install and setup mariadb
* Run the bot

## Setting up Zanod

Install p7zip to extraxt the AppImage

```bash
sudo apt-get install p7zip-full p7zip-rar
```

```bash
sudo su
mkdir /opt/zano-2-1-7-411
cd /opt/zano-2-1-7-411
wget "https://build.zano.org/builds/zano-linux-x64-release-v2.1.7.411[29d02c1].AppImage"
mv zano-linux-x64-release-v2.1.7.411\[29d02c1\].AppImage zano-linux-x64-release-v2.1.7.411\[29d02c1\].7z
7z x zano-linux-x64-release-v2.1.7.411\[29d02c1\].7z
cp /opt/zano-2-1-7-411/usr/bin/* /opt/zano-bin
```

```bash
sudo mkdir /opt/zano-blockchain
sudo mkdir /opt/zano-logs

```

Then setup systemd

```bash
useradd -M zano
usermod -L zano
cp zanod.service /etc/systemd/system/zanod.service
systemctl enable zanod
systemctl start zanod
```
Make sure that the ZANO blockchain is synced before trying to start the bot. The bot will not run unless iot's fully synced!
## Setting up simplewallet

```bash
mkdir /etc/mmbot
mkdir /etc/mmbot/keys
mkdir /etc/mmbot/wallets
cd /etc/mmbot/wallets

/opt/zano-bin/simplewallet --password notsafepassword --generate-new-wallet mywallet.wallet
```

copy the service file from the systemd folder in this repo

```bash
cp zanowallet.service /etc/systemd/system/zanowallet.service
systemctl enable zanowallet
systemctl start zanowallet
```



## Install MariaDB

```bash
apt-get install mariadb-server
sudo mysql
CREATE DATABASE marketmaker DEFAULT CHARACTER SET utf8;
CREATE USER 'marketmaker'@'localhost' IDENTIFIED by 'YOUR_PASSWORD_HERE';
CREATE USER 'marketmaker'@'127.0.0.1' IDENTIFIED by 'YOUR_PASSWORD_HERE';
GRANT ALL ON marketmaker.* TO 'marketmaker'@'localhost';
GRANT ALL ON marketmaker.* TO 'marketmaker'@'127.0.0.1';
FLUSH PRIVILEGES;
```

Go to the folder where you checked out the github project.
```bash
sudo mysql < marketmaker.sql marketmaker
```

## Configure the bot
Go to the folder where you checked out the github project.
```bash
sudo cp config.yaml /etc/mmbot
```

Edit the config and set the following values to the ones you configured for simple wallet. You also need to register an API key with CoinEx if you want to get ZANO price data from CoinEx.

```bash
nano /etc/mmbot/config.yaml


rpcDaemonAddr: "127.0.0.1"
rpcDaemonPort: 11211
rpcWalletAddr: "127.0.0.1"
rpcWalletPort: 11221
rpcWalletAddrRefill: "127.0.0.1"
rpcWalletPortRefill: 11217
rpcWalletAddrAudit: "127.0.0.1"
rpcWalletPortAudit: 11219

dbPassword: <change this>

coinexApiKey: <change this >
```

Create the bot's JWT key.

```bash
sudo python3 createKey.py tradebot.example.com /etc/mmbot/keys/
```

## Run the bot
Go to the folder where you checked out the github project.
```bash
sudo apt-get install openjdk-17-jdk maven
mvn clean install
java -jar target/TradeBot-1.0.jar
```

If the bot runs fine, configure systemd
```bash
useradd -M mmbot
usermod -L mmbot
sudo mkdir /opt/mmbot/
sudo cp target/TradeBot-1.0.jar /opt/mmbot/
cp mmbot.service /etc/systemd/system/mmbot.service
systemctl enable mmbot
systemctl start mmbot
```