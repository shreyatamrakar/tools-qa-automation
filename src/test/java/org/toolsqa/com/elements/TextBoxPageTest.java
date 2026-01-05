package org.toolsqa.com.elements;

import org.testng.annotations.Test;
import org.toolsqa.com.base.BaseTest;
import org.toolsqa.com.pages.elements.TextBoxPage;


public class TextBoxPageTest extends BaseTest {

    @Test
    public void verifyTbpTitle() {

        //navigate
//        navigateMainMenu("//h5[text()='Elements']", "//span[text()='Text Box']"); //navigate to elements
//        search("git pocket guide")
//        TextBoxPage tbp = new TextBoxPage();
//        String title = tbp.getTitle().getText();
//        String expected = "Text Box";
//        Assert.assertTrue(title.matches(expected));
    }

    @Test
    void validateFormElements() {
        TextBoxPage tbp = new TextBoxPage();
        tbp.getTitle();
    }

}
