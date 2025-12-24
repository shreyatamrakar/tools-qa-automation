package org.toolsqa.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.toolsqa.com.base.BasePage;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"root\"]/section/header/div/xc-header/div[2]/div/div/div/div/ul[1]/li[5]/button")
    private WebElement internetElement;

    public WebElement getInternetElement() {
        return internetElement;
    }
}