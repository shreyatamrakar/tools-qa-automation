package org.toolsqa.com.pages.interactions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.toolsqa.com.base.BasePage;

import java.util.List;

public class SortablePage extends BasePage {

    @FindBy(xpath = "//h1[contains(text(),'Sortable')]")
    private WebElement title;

    @FindBy(css = ".vertical-list-container .list-group-item")
    private List<WebElement> listElement;

    public List<WebElement> getListElement() {
        return listElement;
    }

    public WebElement getTitle() {
        return title;
    }
}
