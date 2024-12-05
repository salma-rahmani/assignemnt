package config;

import enums.Environment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;


public class ConfigManager {

    public static final Properties properties = new Properties();
    public static final Logger logger = LogManager.getLogger(ConfigManager.class);

    public static void main(String[] args) {


        loadProperties();
        printAllProperties();
    }

    public static void loadProperties() {

        try {

            FileInputStream propertiesStream = new FileInputStream("src/main/resources/config/config.properties");
            properties.load(propertiesStream);
            propertiesStream.close();

            Environment env = Environment.valueOf(properties.getProperty("env").toUpperCase());
            String envConfigPath = "src/main/resources/config/" + env.name().toLowerCase() + "-config.properties";

            FileInputStream envConfig = new FileInputStream(envConfigPath);
            properties.load(envConfig);
            envConfig.close();


            logger.info("Configuration loaded for environment " + env);


        } catch (IOException e) {
            logger.error("Failed to load configuration. " + e);
            throw new RuntimeException("Configuration loading failed.");
        }
    }

    public static void printAllProperties() {
        logger.info("Listing all configuration properties:");
        for (Map.Entry<Object, Object> entry : properties.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}


