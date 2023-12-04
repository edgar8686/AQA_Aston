package org.example.tests;

import org.example.configuration.SeleniumConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class NameBlockTest extends SeleniumConfig {
    @Test
    void nameBlockTest() {
        acceptAllCookies();
        getBlock().onlineReplenishmentPage();
        Assertions.assertTrue(getBlock().getOnlineReplenishment().isDisplayed(), "Block name is not present");
    }
}
