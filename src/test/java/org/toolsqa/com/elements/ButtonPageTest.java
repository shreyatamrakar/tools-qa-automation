package org.toolsqa.com.elements;

import org.testng.annotations.Test;
import org.toolsqa.com.base.BaseTest;
import org.toolsqa.com.pages.buttons.ButtonPage;

public class ButtonPageTest extends BaseTest {

    @Test
    public void validateBtnAction() {
        ButtonPage btnPg = new ButtonPage();
        actions.contextClick(btnPg.getRightClickBtn()).perform();

    }
}
