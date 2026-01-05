package org.toolsqa.com.pages.widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.toolsqa.com.base.BasePage;

public class AccordianPage extends BasePage {

    @FindBy(xpath = "//h1[contains(text(),'Accordian')]")
    private WebElement accTitle;

    @FindBy(id = "section1Heading")
    private WebElement accElement1;

    @FindBy(xpath = "//div[@id='section1Content']//p" )
    private WebElement accElement1Text;

    @FindBy(id = "section2Heading")
    private WebElement accElement2;

    @FindBy(xpath = "//div[@id='section2Content']//p" )
    private WebElement accElement2Text;

    @FindBy(id = "section3Heading")
    private WebElement accElement3;

    @FindBy(xpath = "//div[@id='section3Content']//p" )
    private WebElement accElement3Text;

    public WebElement getAccTitle() {
        return accTitle;
    }

    public void setAccTitle(WebElement accTitle) {
        this.accTitle = accTitle;
    }

    public WebElement getAccElement1() {
        return accElement1;
    }

    public void setAccElement1(WebElement accElement1) {
        this.accElement1 = accElement1;
    }

    public WebElement getAccElement2() {
        return accElement2;
    }

    public void setAccElement2(WebElement accElement2) {
        this.accElement2 = accElement2;
    }

    public WebElement getAccElement3() {
        return accElement3;
    }

    public void setAccElement3(WebElement accElement3) {
        this.accElement3 = accElement3;
    }

    public WebElement getAccElement1Text() {
        return accElement1Text;
    }

    public void setAccElement1Text(WebElement accElement1Text) {
        this.accElement1Text = accElement1Text;
    }

    public WebElement getAccElement2Text() {
        return accElement2Text;
    }

    public void setAccElement2Text(WebElement accElement2Text) {
        this.accElement2Text = accElement2Text;
    }

    public WebElement getAccElement3Text() {
        return accElement3Text;
    }

    public void setAccElement3Text(WebElement accElement3Text) {
        this.accElement3Text = accElement3Text;
    }
}
