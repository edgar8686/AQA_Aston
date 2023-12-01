package org.example.lesson_14_tests;

import org.example.configuration.SeleniumConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CheckLabelsTest extends SeleniumConfig {
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void checkLabelTest1(int webElements) {
        acceptAllCookies();
        getBlock().onlineReplenishmentPage();
        getBlock().selectNow(getBlock().getSelectOption().get(webElements));
        Assertions.assertTrue(getBlock().getSelectOptionHeader().get(webElements).isDisplayed(), "Label are not work: " + getBlock().getSelectOptionHeader().get(webElements));
    }
}
