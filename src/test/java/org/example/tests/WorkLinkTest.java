package org.example.tests;

import org.example.configuration.SeleniumConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WorkLinkTest extends SeleniumConfig {
    @Test
    void workLinkTest() {
        acceptAllCookies();
        getBlock().onlineReplenishmentPage();
        getBlock().linkClick();
        for (WebElement element : getBlock().getWorkLink()) {
            Assertions.assertTrue(element.isDisplayed(), "Element is not displayed");
        }
    }

}
