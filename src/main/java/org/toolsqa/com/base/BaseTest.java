package org.toolsqa.com.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.toolsqa.com.utils.BrowserFactory;
import org.toolsqa.com.utils.ConfigReader;
import org.toolsqa.com.utils.DriverManager;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        String browser = ConfigReader.getProperty("browser");
        DriverManager.setDriver(BrowserFactory.createDriver(browser));
        DriverManager.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.unload();
    }
}