package org.toolsqa.com.pages.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.toolsqa.com.base.BasePage;

public class TextBoxPage extends BasePage {

    // outer element
    @FindBy(xpath = "//h1[contains(text(),'Text Box')]")
    private WebElement title;

    // form elements
    @FindBy(id = "userName")
    private WebElement fullName;

    @FindBy(id = "userEmail")
    private WebElement email;

    @FindBy(id = "currentAddress")
    private WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    private WebElement permanentAddress;

    public WebElement getTitle() {
        return title;
    }

    public WebElement getFullName() {
        return fullName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getCurrentAddress() {
        return currentAddress;
    }

    public WebElement getPermanentAddress() {
        return permanentAddress;
    }
}
