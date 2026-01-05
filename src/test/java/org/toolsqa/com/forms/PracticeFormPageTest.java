package org.toolsqa.com.forms;

import org.testng.annotations.Test;
import org.toolsqa.com.base.BaseTest;

import static org.toolsqa.com.utils.CommonMethods.navigateMainMenu;

public class PracticeFormPageTest extends BaseTest {

    @Test
    public void verifyPracticeFormPageTitle() {

        navigateMainMenu("//h5[text()='Forms']", "//span[text()='Practice Form']");



    }

}
