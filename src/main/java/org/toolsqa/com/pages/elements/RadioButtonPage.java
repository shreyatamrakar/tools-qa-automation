package org.toolsqa.com.pages.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.toolsqa.com.base.BasePage;

public class RadioButtonPage extends BasePage {

   /*
   custom xpath => //tag[conditions][index]
   Where conditions can include:
        @attribute='value' → exact match
        contains(@attribute, 'value') → partial match
        text()='Exact Text' → exact text match
        contains(text(),'Partial Text') → partial text match

   drill down example:
        //div[@id='section1Content']//p[2]
   */

    @FindBy(xpath = "//h1[contains(text(),'Radio Button')]")
    private WebElement title; //title of radio btn page

    @FindBy(xpath = "//div[text()='Do you like the site?']")
    private WebElement question;

    @FindBy(id = "yesRadio")
    private WebElement rbYes;

    @FindBy(id = "impressiveRadio")
    private WebElement rbImpressive;

    @FindBy(id ="noRadio")
    private WebElement rbNo;

    public WebElement getTitle() {
        return title;
    }

    public void setTitle(WebElement title) {
        this.title = title;
    }

    public WebElement getQuestion() {
        return question;
    }

    public void setQuestion(WebElement question) {
        this.question = question;
    }

    public WebElement getRbYes() {
        return rbYes;
    }

    public void setRbYes(WebElement rbYes) {
        this.rbYes = rbYes;
    }

    public WebElement getRbImpressive() {
        return rbImpressive;
    }

    public void setRbImpressive(WebElement rbImpressive) {
        this.rbImpressive = rbImpressive;
    }

    public WebElement getRbNo() {
        return rbNo;
    }

    public void setRbNo(WebElement rbNo) {
        this.rbNo = rbNo;
    }
}