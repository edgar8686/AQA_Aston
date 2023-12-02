package org.example.tests;

import org.example.configuration.SeleniumConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LogosTest extends SeleniumConfig {
    @Test
    void logosTest() {
        acceptAllCookies();
        getBlock().onlineReplenishmentPage();
        Assertions.assertTrue(!getBlock().getLogos().isEmpty(), "List of elements is empty");
        Assertions.assertEquals(6, getBlock().getLogos().size(), "Expected 6 elements, but found " + getBlock().getLogos().size());
        for (WebElement element : getBlock().getLogos()) {
            Assertions.assertTrue(element.isDisplayed(), "Element is not displayed");
        }
    }
}
