package com.zanable.marketmaking.bot.services;

import com.zanable.marketmaking.bot.beans.zano.*;
import com.zanable.shared.interfaces.ApplicationService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class DatabaseService implements ApplicationService {

    private final static Logger logger = LoggerFactory.getLogger(DatabaseService.class);
    private static LinkedHashMap<String, Object> config;

    public DatabaseService(LinkedHashMap<String, Object> config) {
        this.config = config;
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }

    /**
     * Insert trade log into Database
     * @param conn
     * @param myOrderId
     * @param otherOrderId
     * @param tokenAmount
     * @param zanoAmount
     * @param type
     * @param txid
     * @param timestamp
     * @param price
     * @param zanoPriceUsdt
     * @param assetId
     */
    public static void insertTradeLog(Connection conn, long myOrderId, long otherOrderId, BigInteger tokenAmount,
                                  BigInteger zanoAmount, String type, String txid, Timestamp timestamp,
                                      BigInteger price, BigDecimal zanoPriceUsdt, String assetId) {

        boolean connWasNull = false;

        try {

            if (conn == null) {
                conn = getConnection();
                connWasNull = true;
            }
            String query = "INSERT INTO trade_log (my_order_id, other_order_id, token_amount, zano_amount, type, txid, timestamp, zano_price, zano_usdt_price, asset_id) VALUES (?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1, myOrderId);
            ps.setLong(2, otherOrderId);
            ps.setString(3, tokenAmount.toString());
            ps.setString(4, zanoAmount.toString());
            ps.setString(5, type);
            ps.setString(6, txid);
            ps.setTimestamp(7, timestamp);
            ps.setString(8, price.toString());
            ps.setBigDecimal(9, zanoPriceUsdt);
            ps.setString(10, assetId);
            ps.execute();
            ps.close();

            if (connWasNull) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertZanoBuyBack(Connection conn, long orderId, BigDecimal amount, BigDecimal zanoAmount) {

        /*
        CREATE TABLE `zano_buy_back_log` (
          `id` bigint(20) NOT NULL AUTO_INCREMENT,
          `connected_order` bigint(20) NOT NULL,
          `timestamp` timestamp NOT NULL,
          `usdt_amount` decimal(24,6) NOT NULL DEFAULT 0.000000,
          `usdt_amount_filled` decimal(24,6) NOT NULL DEFAULT 0.000000,
          PRIMARY KEY (`id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci
         */

        boolean connWasNull = false;

        try {

            if (conn == null) {
                conn = getConnection();
                connWasNull = true;
            }
            String query = "INSERT INTO zano_buy_back_log (connected_order, timestamp, usdt_amount, zano_amount) VALUES (?,NOW(),?,?);";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1, orderId);
            ps.setBigDecimal(2, amount);
            ps.setBigDecimal(3, zanoAmount);
            ps.execute();
            ps.close();

            if (connWasNull) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Insert order log
     * @param conn
     * @param orderId
     * @param total
     * @param price
     * @param left
     * @param status
     * @param opened
     * @param closed
     * @param type
     * @param zanoUsdtPrice
     */
    public static void insertOrderLog(Connection conn, long orderId, BigDecimal total, BigDecimal price,
                                      BigDecimal left, int status, Timestamp opened, Timestamp closed, String type, BigDecimal zanoUsdtPrice) {

        boolean connWasNull = false;

        try {

            if (conn == null) {
                conn = getConnection();
                connWasNull = true;
            }
            String query = "INSERT INTO order_log (order_id, total, price, amount_left, status, opened, closed, type, amount_start, zano_usdt_price) " +
                    "VALUES (?,?,?,?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE amount_left=?, closed=?;";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1, orderId);
            ps.setBigDecimal(2, total);
            ps.setBigDecimal(3, price);
            ps.setBigDecimal(4, left);
            ps.setInt(5, status);
            ps.setTimestamp(6, opened);
            ps.setTimestamp(7, closed);
            ps.setString(8, type);
            ps.setBigDecimal(9, left);
            ps.setBigDecimal(10, zanoUsdtPrice);

            ps.setBigDecimal(11, left);
            ps.setTimestamp(12, closed);

            ps.execute();
            ps.close();

            if (connWasNull) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Insert wallet log
     * @param conn
     * @param timestamp
     * @param assetId
     * @param utxos
     * @param total
     * @param unlocked
     * @param walletAddress
     * @param ident
     */
    public static void insertWalletLog(Connection conn, Timestamp timestamp, String assetId, long utxos, BigInteger total, BigInteger unlocked, String walletAddress, String ident) {

        boolean connWasNull = false;

        try {

            if (conn == null) {
                conn = getConnection();
                connWasNull = true;
            }
            String query = "INSERT INTO zano_wallet_balance (timestamp, asset_id, utxos, total, unlocked, wallet_address, ident) " +
                    "VALUES (?,?,?,?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setTimestamp(1, timestamp);
            ps.setString(2, assetId);
            ps.setLong(3, utxos);
            ps.setString(4, total.toString());
            ps.setString(5, unlocked.toString());
            ps.setString(6, walletAddress);
            ps.setString(7, ident);
            ps.execute();
            ps.close();

            if (connWasNull) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Insert swap into database
     * @param conn
     * @param swapProposalInfo
     * @param txid
     * @param accepted
     * @param reason
     * @param myOrderId
     * @param otherOrderId
     */
    public static void insertSwap(Connection conn, SwapProposalInfo swapProposalInfo, String txid, boolean accepted, String reason, long myOrderId, long otherOrderId) {

        boolean connWasNull = false;

        try {

            if (conn == null) {
                conn = getConnection();
                connWasNull = true;
            }
            String query = "INSERT INTO swaps (to_finalizer_amount, to_finalizer_asset_id, to_initiator_amount, to_initiator_asset_id, txid, accepted, reason, my_order_id, other_order_id) " +
                    "VALUES (?,?,?,?,?,?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setLong(1, swapProposalInfo.getTo_finalizer()[0].getAmount());
            ps.setString(2, swapProposalInfo.getTo_finalizer()[0].getAsset_id());
            ps.setLong(3,  swapProposalInfo.getTo_initiator()[0].getAmount());
            ps.setString(4, swapProposalInfo.getTo_initiator()[0].getAsset_id());
            ps.setString(5, txid);
            ps.setBoolean(6, accepted);
            ps.setString(7, reason);
            ps.setLong(8,  myOrderId);
            ps.setLong(9,  otherOrderId);
            ps.execute();
            ps.close();

            if (connWasNull) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Close active order by adding a timestamp to column 'closed'
     * @param orderId
     * @param status
     * @param closed
     */
    public static void closeOrder(long orderId, int status, Timestamp closed) {
        PreparedStatement ps = null;
        Connection conn;
        try {
            conn = getConnection();
            ps = conn.prepareStatement("UPDATE order_log SET status=?, closed=? WHERE order_id = ? AND status >= 1 AND closed IS null");
            ps.setInt(1, status);
            ps.setTimestamp(2, closed);
            ps.setLong(3, orderId);
            int rows = ps.executeUpdate();

            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Update order status
     * @param orderId
     * @param status
     * @param left
     */
    public static void updateOrder(long orderId, int status, BigDecimal left) {
        PreparedStatement ps = null;
        Connection conn;
        try {
            conn = getConnection();
            ps = conn.prepareStatement("UPDATE order_log SET status=?, amount_left=? WHERE order_id = ? AND status > 0 AND closed IS null");
            ps.setInt(1, status);
            ps.setBigDecimal(2, left);
            ps.setLong(3, orderId);
            int rows = ps.executeUpdate();

            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Upsert zano asset meta data
     * @param conn
     * @param assetInfo
     */
    public static void insertZanoAsset(Connection conn, AssetInfo assetInfo) {

        boolean connWasNull = false;

        try {

            if (conn == null) {
                conn = getConnection();
                connWasNull = true;
            }
            String query = "INSERT INTO zano_assets (asset_id, current_supply, decimals, full_name, hidden_supply, meta_info, owner, owner_eth_pub_key, ticker, total_max_supply) " +
                    "VALUES (?,?,?,?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE current_supply=?, owner=?, owner_eth_pub_key=?;";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, assetInfo.getAsset_id());
            ps.setString(2, assetInfo.getCurrent_supply().toString());
            ps.setInt(3, assetInfo.getDecimal_point());
            ps.setString(4, assetInfo.getFull_name());
            ps.setBoolean(5, assetInfo.isHidden_supply());
            ps.setString(6, assetInfo.getMeta_info());
            ps.setString(7, assetInfo.getOwner());
            ps.setString(8, assetInfo.getOwner_eth_pub_key());
            ps.setString(9, assetInfo.getTicker());
            ps.setString(10, assetInfo.getTotal_max_supply().toString());
            ps.setString(11, assetInfo.getCurrent_supply().toString());
            ps.setString(12, assetInfo.getOwner());
            ps.setString(13, assetInfo.getOwner_eth_pub_key());

            ps.execute();
            ps.close();

            if (connWasNull) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Insert zano wallet transaction into database
     * @param conn
     * @param ident
     * @param walletTransfer
     * @param subtransfer
     * @param vout
     * @param txIndex
     */
    public static void insertZanoWalletTransaction(Connection conn, String ident, WalletTransfer walletTransfer, Subtransfer subtransfer, long vout, long txIndex) {

        boolean connWasNull = false;

        try {

            if (conn == null) {
                conn = getConnection();
                connWasNull = true;
            }
            String query = "INSERT INTO zano_wallet_transactions (txid, comment, fee, height, is_mining, is_mixing, is_service, payment_id, remote_address, remote_alias, " +
                    "vout, amount, asset_id, is_income, timestamp, unlock_time, wallet_ident, tx_index) " +
                    "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE height=?;";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, walletTransfer.getTx_hash());
            ps.setString(2, walletTransfer.getComment());
            ps.setString(3, walletTransfer.getFee().toString());
            ps.setLong(4, walletTransfer.getHeight());
            ps.setBoolean(5, walletTransfer.is_mining());
            ps.setBoolean(6, walletTransfer.is_mixing());
            ps.setBoolean(7, walletTransfer.is_service());
            ps.setString(8, walletTransfer.getPayment_id());
            String remoteAdress = null;
            if (walletTransfer.getRemote_addresses() != null && walletTransfer.getRemote_addresses().length>0) {
                remoteAdress = walletTransfer.getRemote_addresses()[0];
            }
            ps.setString(9, remoteAdress);
            String remoteAlias = null;
            if (walletTransfer.getRemote_aliases() != null && walletTransfer.getRemote_aliases().length>0) {
                remoteAlias = walletTransfer.getRemote_aliases()[0];
            }
            ps.setString(10, remoteAlias);
            ps.setLong(11, vout);
            ps.setString(12, subtransfer.getAmount().toString());
            ps.setString(13, subtransfer.getAsset_id());
            ps.setBoolean(14, subtransfer.is_income());
            ps.setTimestamp(15, new Timestamp(walletTransfer.getTimestamp()*1000));
            ps.setLong(16, walletTransfer.getUnlock_time());
            ps.setString(17, ident);
            ps.setLong(18, txIndex);
            ps.setLong(19, walletTransfer.getHeight());

            ps.execute();
            ps.close();

            if (connWasNull) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Update the tx index for the zano wallet
     * @param walletIdent
     * @param newIndex
     * @return
     */
    public static long updateTxIndex(String walletIdent, long newIndex) {
        long txIndex = 0;
        try {
            Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE settings SET transaction_index=? WHERE wallet_ident=?");
            ps.setLong(1, newIndex);
            ps.setString(2, walletIdent);
            ps.execute();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return txIndex;
    }

    /**
     * Get current tx index
     * @param ident
     * @return
     */
    public static long getTxIndex(String ident) {
        long txIndex = 0;
        try {
            Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT transaction_index FROM settings WHERE wallet_ident=?");
            ps.setString(1, ident);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                txIndex = rs.getLong("transaction_index");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return txIndex;
    }

    public static List<InternalWalletTransfer> getAuditTransferList() {
        /*
        CREATE TABLE `audit_wallet_transfers` (
          `id` int(11) NOT NULL AUTO_INCREMENT,
          `requester` varchar(256) DEFAULT NULL,
          `comment` varchar(256) DEFAULT NULL,
          `txid` varchar(256) DEFAULT NULL,
          `status` int(11) DEFAULT NULL,
          `timestamp` timestamp NULL DEFAULT NULL,
          `amount` decimal(32,12) DEFAULT NULL,
          PRIMARY KEY (`id`)
        ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci
         */
        List<InternalWalletTransfer> transfers = new ArrayList<>();
        try {
            Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM audit_wallet_transfers WHERE status=0;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                transfers.add(InternalWalletTransfer.builder()
                        .id(rs.getInt("id"))
                        .requester(rs.getString("requester"))
                        .comment(rs.getString("comment"))
                        .status(0)
                        .timestamp(rs.getTimestamp("timestamp"))
                        .amount(rs.getBigDecimal("amount"))
                        .build()
                );
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return transfers;
    }

    public static int updateAuditTransfer(int id, int status, String error, String txid) {
        int rows = 0;
        try {
            Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE audit_wallet_transfers SET status=?, error=?, txid=? WHERE id=?");
            ps.setInt(1, status);
            ps.setString(2, error);
            ps.setString(3, txid);
            ps.setInt(4, id);
            rows = ps.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    /**
     * Get "hot" application settings (reloaded without restarting the whole application)
     * @return Settings Map
     */
    public static HashMap<String, String> getAppSettingsFromDb() {
        HashMap<String, String> settings = new HashMap<>();
        try {
            Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT `key`, `value` FROM app_settings;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                settings.put(rs.getString("key"), rs.getString("value"));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return settings;
    }

    /**
     * Get token buy sell statistics
     * @return
     */
    public static JSONArray getTokensBuySellStats() {
        JSONArray jsonArray = new JSONArray();
        try {
            Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT SUM(token_amount) AS tokens, B.decimals, SUM(zano_amount) AS zano, A.type FROM trade_log A JOIN zano_assets B ON (A.asset_id = B.asset_id) GROUP BY type;");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                JSONObject tradeStats = new JSONObject();
                int decimals = rs.getInt("decimals");
                BigDecimal tokenTraded = rs.getBigDecimal("tokens").movePointLeft(decimals);
                tradeStats.put("tokens", tokenTraded);
                BigDecimal zanoTraded = rs.getBigDecimal("zano").movePointLeft(12);
                tradeStats.put("zano", zanoTraded);
                tradeStats.put("side", rs.getString("type"));
                jsonArray.add(tradeStats);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }

    /**
     * Get last 20 trades
     * @return trade array
     */
    public static JSONArray getLastTrades() {
        return getLastTrades(20);
    }

    /**
     * Get last trades
     * @param count
     * @return trade array
     */
    public static JSONArray getLastTrades(int count) {
        JSONArray jsonArray = new JSONArray();
        try {
            Connection conn = getConnection();
            String query = "SELECT A.zano_amount, A.token_amount, B.decimals, B.ticker, A.zano_usdt_price, A.type, A.timestamp, A.my_order_id, A.other_order_id FROM trade_log A JOIN zano_assets B ON (A.asset_id = B.asset_id) ORDER BY timestamp DESC LIMIT ?;";
            if (count == 0) {
                query = "SELECT A.zano_amount, A.token_amount, B.decimals, B.ticker, A.zano_usdt_price, A.type, A.timestamp FROM trade_log A JOIN zano_assets B ON (A.asset_id = B.asset_id) ORDER BY timestamp DESC;";
            }
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, count);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                JSONObject trade = new JSONObject();
                int decimals = rs.getInt("decimals");
                BigDecimal tokenAmount = new BigDecimal(rs.getString("token_amount")).movePointLeft(decimals);
                trade.put("tokensTraded", tokenAmount);
                BigDecimal zanoTraded = new BigDecimal(rs.getString("zano_amount")).movePointLeft(12);
                trade.put("zanoTraded", zanoTraded);
                trade.put("ticker", rs.getString("ticker"));
                trade.put("zanoUsdtPrice", rs.getString("zano_usdt_price"));
                trade.put("type", rs.getString("type"));
                trade.put("timestamp", rs.getString("timestamp"));
                trade.put("myOrderId", rs.getLong("my_order_id"));
                trade.put("otherOrderId", rs.getLong("other_order_id"));
                jsonArray.add(trade);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }

    /**
     * Creates database connection based on the application config file
     * @return
     * @throws SQLException
     */
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection((String) config.get("dbConnectionUrl"), (String) config.get("dbUser"), (String) config.get("dbPassword"));
    }

}
