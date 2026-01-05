package org.toolsqa.com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {

    public static void navigateMainMenu(String xpath1, String xpath2) {
        WebDriver driver = DriverManager.getDriver();
        WebElement mainMenuElements1 = driver.findElement(By.xpath(xpath1));
        mainMenuElements1.click();

        WebElement mainMenuElements2 = driver.findElement(By.xpath(xpath2));
        mainMenuElements2.click();
    }
}
