package org.toolsqa.com.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.toolsqa.com.base.BaseTest;
import org.toolsqa.com.pages.elements.TextBoxPage;

public class TextBoxPageTest extends BaseTest {

    @Test
    public void verifyTbpTitle() {
        TextBoxPage tbp = new TextBoxPage();
        String title = tbp.getTitle().getText();
        String expected = "Text Box";
        Assert.assertTrue(title.matches(expected));
    }

    @Test
    public void validateFormElements() {
        TextBoxPage tbp = new TextBoxPage();

        String expected = "visible";
        String actual = "";

        if (tbp.getTitle().isDisplayed() ) {
            actual = "visible";
        } else {
            actual = "notVisible";
        }

        Assert.assertTrue(expected.matches(actual));

    }

}
