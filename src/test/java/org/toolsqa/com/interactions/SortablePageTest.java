package org.toolsqa.com.interactions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.toolsqa.com.base.BaseTest;
import org.toolsqa.com.pages.interactions.SortablePage;

import java.time.Duration;
import java.util.List;

public class SortablePageTest extends BaseTest {

    public void sortList(WebElement source, WebElement target) {
        actions
                .clickAndHold(source)
                .moveToElement(target)
                .pause(Duration.ofMillis(10000))
                .release()
                .build()
                .perform();
    }

    @Test
    public void validateSortListFunc() {
        SortablePage srtPg = new SortablePage();

        List<WebElement> listElement;
        listElement = srtPg.getListElement();

        sortList(listElement.get(0), listElement.get(3));//One ---replaces---> Four

        srtPg.getTitle().click();
        sortList(listElement.get(2), listElement.get(0));//Four ---replaces---> Two
        srtPg.getTitle().click();

        String firstElementValue = srtPg.getListElement().get(0).getText(); //Four

        System.out.println("***firstElementValue: " + firstElementValue);
        Assert.assertEquals(firstElementValue, "Four");

    }


}
