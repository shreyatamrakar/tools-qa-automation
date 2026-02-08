package org.toolsqa.com.pages.buttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.toolsqa.com.base.BasePage;

public class ButtonPage extends BasePage {

    @FindBy(id = "rightClickBtn")
    private WebElement rightClickBtn;

    public WebElement getRightClickBtn() {
        return rightClickBtn;
    }
}
