package org.toolsqa.com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.toolsqa.com.utils.BrowserFactory;
import org.toolsqa.com.utils.ConfigReader;
import org.toolsqa.com.utils.DriverManager;

public class BaseTest {

    protected WebDriver driver;
    protected Actions actions;

    @BeforeMethod
    public void setUp() {
        String browser = ConfigReader.getProperty("browser");
        DriverManager.setDriver(BrowserFactory.createDriver(browser));

        driver = DriverManager.getDriver();     // store driver reference
        actions = new Actions(driver);           // initialize Actions

        DriverManager.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.unload();
    }
}