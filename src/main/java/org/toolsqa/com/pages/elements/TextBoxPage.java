package org.toolsqa.com.pages.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.toolsqa.com.base.BasePage;

public class TextBoxPage extends BasePage {

    // outer element
    @FindBy(xpath = "//h1[contains(text(),'Text Box')]")
    private WebElement title;

    // form input elements
    @FindBy(id = "userName")
    private WebElement fullNameInput;

    @FindBy(id = "userEmail")
    private WebElement emailInput;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    private WebElement permanentAddressInput;

    // form label elements
    @FindBy(id = "userName-label")
    private WebElement fullNameLabel;

    @FindBy(id = "userEmail-label")
    private WebElement emailLabel;

    @FindBy(id = "currentAddress-label")
    private WebElement currentAddressLabel;

    @FindBy(id = "permanentAddress-label")
    private WebElement permanentAddressLabel;

    // form button elements
//    @FindBy(id = "submit")
    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButton;

    // output box elements
    @FindBy(id = "name")
    private WebElement nameOutput;

    @FindBy(id = "email")
    private WebElement emailOutput;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressOutput;

    @FindBy(id = "permanentAddress")
    private WebElement permanentAddressOutput;

    public WebElement getTitle() {
        return title;
    }

    public void setTitle(WebElement title) {
        this.title = title;
    }

    public WebElement getFullNameInput() {
        return fullNameInput;
    }

    public void setFullNameInput(WebElement fullNameInput) {
        this.fullNameInput = fullNameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public void setEmailInput(WebElement emailInput) {
        this.emailInput = emailInput;
    }

    public WebElement getCurrentAddressInput() {
        return currentAddressInput;
    }

    public void setCurrentAddressInput(WebElement currentAddressInput) {
        this.currentAddressInput = currentAddressInput;
    }

    public WebElement getPermanentAddressInput() {
        return permanentAddressInput;
    }

    public void setPermanentAddressInput(WebElement permanentAddressInput) {
        this.permanentAddressInput = permanentAddressInput;
    }

    public WebElement getFullNameLabel() {
        return fullNameLabel;
    }

    public void setFullNameLabel(WebElement fullNameLabel) {
        this.fullNameLabel = fullNameLabel;
    }

    public WebElement getEmailLabel() {
        return emailLabel;
    }

    public void setEmailLabel(WebElement emailLabel) {
        this.emailLabel = emailLabel;
    }

    public WebElement getCurrentAddressLabel() {
        return currentAddressLabel;
    }

    public void setCurrentAddressLabel(WebElement currentAddressLabel) {
        this.currentAddressLabel = currentAddressLabel;
    }

    public WebElement getPermanentAddressLabel() {
        return permanentAddressLabel;
    }

    public void setPermanentAddressLabel(WebElement permanentAddressLabel) {
        this.permanentAddressLabel = permanentAddressLabel;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(WebElement submitButton) {
        this.submitButton = submitButton;
    }

    public WebElement getNameOutput() {
        return nameOutput;
    }

    public void setNameOutput(WebElement nameOutput) {
        this.nameOutput = nameOutput;
    }

    public WebElement getEmailOutput() {
        return emailOutput;
    }

    public void setEmailOutput(WebElement emailOutput) {
        this.emailOutput = emailOutput;
    }

    public WebElement getCurrentAddressOutput() {
        return currentAddressOutput;
    }

    public void setCurrentAddressOutput(WebElement currentAddressOutput) {
        this.currentAddressOutput = currentAddressOutput;
    }

    public WebElement getPermanentAddressOutput() {
        return permanentAddressOutput;
    }

    public void setPermanentAddressOutput(WebElement permanentAddressOutput) {
        this.permanentAddressOutput = permanentAddressOutput;
    }
}
