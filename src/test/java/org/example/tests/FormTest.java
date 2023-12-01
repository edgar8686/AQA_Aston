package org.example.tests;

import org.example.configuration.SeleniumConfig;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import static org.junit.jupiter.api.Assertions.assertTrue;


public class FormTest extends SeleniumConfig {
    @Test
    void formTest() {
        acceptAllCookies();
        getBlock().onlineReplenishmentPage();
        getBlock().clickContinue();
        //getDriver().switchTo().frame(getDriver().findElement(By.xpath("//div/iframe")));
        //getDriver().switchTo().window(getDriver().getWindowHandle());
        for (WebElement element : getBlock().getForm()) {
            assertTrue(element.isDisplayed(), "Element is not displayed");
        }
    }
}
