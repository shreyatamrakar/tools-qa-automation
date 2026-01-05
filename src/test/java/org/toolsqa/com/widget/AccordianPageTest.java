package org.toolsqa.com.widget;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.toolsqa.com.base.BaseTest;
import org.toolsqa.com.pages.widgets.AccordianPage;

public class AccordianPageTest extends BaseTest {


    // Test Case 1: Verify all the accordian elements
    @Test
    public void validateAllAccordianElement() {
        AccordianPage acc1 = new AccordianPage();
        String expected = "true";
        String actual = "";

        if (acc1.getAccTitle().isDisplayed()
                && acc1.getAccElement1().isDisplayed()
                && acc1.getAccElement2().isDisplayed()
                && acc1.getAccElement3().isDisplayed()
        ) {
            actual = "true";
        } else {
            actual = "false";
        }

        Assert.assertEquals(actual, expected); //test case pass if not equal fail
    }

    // Test Case 2: Verify all elements in accordian page matches expected value
    @Test
    public void validateAllAccordian() {
        AccordianPage acc2 = new AccordianPage();
        String expected1 = "What is Lorem Ipsum?";
        String expected2 = "Where does it come from?";
        String expected3 = "Why do we use it?";

        acc2.getAccElement1().getText();

        Assert.assertEquals(acc2.getAccElement1().getText(), expected1);
        Assert.assertEquals(acc2.getAccElement2().getText(), expected2);
        Assert.assertEquals(acc2.getAccElement3().getText(), expected3);
    }

    // Test Case 3: verify all the accordian subText is displayed
    @Test
    public void validateAllTextAcc() {
        AccordianPage acc3 = new AccordianPage();
        boolean expected = true;

        Assert.assertEquals(acc3.getAccElement1Text().isDisplayed(), expected);

        acc3.getAccElement2().click();
        Assert.assertEquals(acc3.getAccElement2Text().isDisplayed(), expected);

        acc3.getAccElement3().click();
        Assert.assertEquals(acc3.getAccElement3Text().isDisplayed(), expected);

    }
}
