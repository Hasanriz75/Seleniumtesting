package utils.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LocatorUtil {
    private static Properties properties = new Properties();

    static {
        try {
            // Load the locators.properties file
            FileInputStream fis = new FileInputStream("src/main/java/resources/locators.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get locator by key
    public static String getLocator(String key) {
        return properties.getProperty(key);
    }
}