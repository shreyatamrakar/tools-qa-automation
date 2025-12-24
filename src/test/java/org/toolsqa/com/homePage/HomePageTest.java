package org.toolsqa.com.homePage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.toolsqa.com.base.BaseTest;
import org.toolsqa.com.pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageTitle() {
        HomePage home = new HomePage();

        String text = home.getInternetElement().getText();
        System.out.println("*****"+ text);

        String expected = "Internet";
        Assert.assertTrue(home.getInternetElement().getText().contains(expected));

    }
}
