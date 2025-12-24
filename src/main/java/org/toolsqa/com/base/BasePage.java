package org.toolsqa.com.base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.toolsqa.com.utils.DriverManager;

public class BasePage {

    protected WebDriver getDriver() {

        return DriverManager.getDriver();
    }

    // base constructor to initializes all @FindBy elements in subclasses
    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }
}