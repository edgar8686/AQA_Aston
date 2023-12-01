package org.example.lesson_14_tests;

import org.example.configuration.SeleniumConfig;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisplayingAmountTest extends SeleniumConfig {
    @Test
    void displayingAmount() {
        acceptAllCookies();
        getBlock().onlineReplenishmentPage();
        getBlock().clickContinue();
        getBlock().getIFrame();
        for (WebElement element : getBlock().getForm()) {
            assertTrue(element.isDisplayed(), "Element is not displayed");
        }
    }
}
