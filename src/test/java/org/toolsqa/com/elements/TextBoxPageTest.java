package org.toolsqa.com.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.toolsqa.com.base.BaseTest;
import org.toolsqa.com.pages.elements.TextBoxPage;


public class TextBoxPageTest extends BaseTest {

    // Test Scenario - submit text box form and validate it's result
    @Test
    public void formValidation(){
        TextBoxPage tbp = new TextBoxPage();
        tbp.getFullNameInput().click();
        tbp.getFullNameInput().sendKeys("testFirstName testLastName");

        tbp.getEmailInput().click();
        tbp.getEmailInput().sendKeys("test@gmail.com");

        tbp.getCurrentAddressInput().click();
        tbp.getCurrentAddressInput().sendKeys("123 test");

        tbp.getPermanentAddressInput().click();
        tbp.getPermanentAddressInput().sendKeys("456 test");

        tbp.getSubmitButton().click();

        //actual vs expected
        String expectedName = "testFirstName testLastName";
        String actualName = tbp.getNameOutput().getText();//Name:testFirstName testLastName

        boolean condition1 = actualName.contains(expectedName);

        Assert.assertTrue(condition1);




//        Assert.assertTrue();
        String expectedEmail = "test@gmail.com";
        String actualEmail = tbp.getEmailOutput().getText(); //Email:test@gmail.com

        boolean condition2 = actualEmail.contains(expectedEmail);

        Assert.assertTrue(condition2);


        String expectedCurrentAdd = "123 test";
        String actualCurrentAdd = tbp.getCurrentAddressOutput().getAttribute("value"); //CurrentAdd:123 test

        boolean condition3 = actualCurrentAdd.contains(expectedCurrentAdd);

        Assert.assertTrue(condition3);



        String expectedPermanentAdd = "456 test";
        String actualPermanentAdd = tbp.getPermanentAddressOutput().getText(); //PermanentAdd:456 test

        boolean condition4 = actualPermanentAdd.contains(expectedPermanentAdd);

        Assert.assertTrue(condition4);


    }




}
