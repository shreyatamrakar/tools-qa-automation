package org.toolsqa.com.utils;

import java.io.FileInputStream;
import java.util.Properties;

import static org.toolsqa.com.utils.Constants.CONFIG_PATH;

public class ConfigReader {

    private static Properties prop;

    static {
        try {
            prop = new Properties();
            FileInputStream configInput = new FileInputStream(CONFIG_PATH);
            prop.load(configInput);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load config.properties");
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}