package org.toolsqa.com.utils;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    // stores a separate WebDriver instance per thread
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // return webDriver assosiated with current thread
    public static WebDriver getDriver() {
        return driver.get();
    }

    // set webDriver instance for current thread
    public static void setDriver(WebDriver driverRef) {
        driver.set(driverRef);
    }

    // close/remove webDriver assosiated with current thread
    public static void unload() {
        driver.get().quit();
        driver.remove();
    }
}