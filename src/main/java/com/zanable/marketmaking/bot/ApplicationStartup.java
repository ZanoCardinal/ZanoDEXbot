package com.zanable.marketmaking.bot;

import com.zanable.marketmaking.bot.services.*;
import com.zanable.shared.interfaces.ApplicationService;
import com.zanable.shared.services.SigningEngine;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

    private final static Logger logger = LoggerFactory.getLogger(ApplicationStartup.class);
    private List<ApplicationService> serviceList = new ArrayList<ApplicationService>();
    private static LinkedHashMap<String, Object> config = new LinkedHashMap<>();

    @Value("${config:/etc/mmbot/config.yaml}")
    private String configPath;

    /**
     * This event is executed as late as conceivably possible to indicate that
     * the application is ready to service requests.
     */
    @Override
    public void onApplicationEvent(final ApplicationReadyEvent event) {

        try {
            Yaml yaml = new Yaml();
            File configFile = new File(configPath);
            InputStream inputStream = new FileInputStream(configFile);
            config = yaml.load(inputStream);
            logger.info("Loaded config file with " + config.size() + " values");
        } catch (Exception e) {
            e.printStackTrace();
        }

        DatabaseService databaseService = new DatabaseService(config);
        databaseService.init();
        serviceList.add(databaseService);

        SigningEngine signingEngine = new SigningEngine(config);
        signingEngine.init();
        serviceList.add(signingEngine);

        ZanoWalletService zanoService = new ZanoWalletService(config);
        zanoService.init();
        serviceList.add(zanoService);

        OrderBookAggregatorService aggregatorService = new OrderBookAggregatorService(config);
        aggregatorService.init();
        serviceList.add(aggregatorService);

        ZanoTradeService zanoTradeService = new ZanoTradeService(config);
        zanoTradeService.init();
        serviceList.add(zanoTradeService);

        ZanoPriceService zanoPriceService = new ZanoPriceService(config);
        zanoPriceService.init();
        serviceList.add(zanoPriceService);
    }

    @PreDestroy
    public void destroy() {
        for (ApplicationService service : serviceList) {
            service.destroy();
        }
    }

    public static Object getConfig(String key) {
        return config.get(key);
    }

}

