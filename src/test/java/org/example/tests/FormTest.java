package org.example.tests;

import org.example.configuration.SeleniumConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class FormTest extends SeleniumConfig {
    @Test
    void formTest() {
        acceptAllCookies();
        getBlock().onlineReplenishmentPage();
        getBlock().clickContinue();
        List<WebElement> frames = getDriver().findElements(By.tagName("iframe"));
        String targetFrameNamePart = "ya-frame";
        for (WebElement frame : frames) {
            String frameName = frame.getAttribute("name");
            if (frameName != null && frameName.contains(targetFrameNamePart)) {
                System.out.println("Switching to Frame: " + frameName);
                getDriver().switchTo().frame(frame);
                break;
            }
        }
        for (WebElement element : getBlock().getForm()) {
            assertTrue(element.isDisplayed(), "Element is not displayed");
        }
    }
}
