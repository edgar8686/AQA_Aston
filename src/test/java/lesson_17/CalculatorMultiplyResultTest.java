package lesson_17;

import config.AndroidConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorMultiplyResultTest extends AndroidConfig {
    @Test
    void calculatorMultiplyTest() {
        getElementPage().elementClick(getCalculator().getNumber7())
                .elementClick(getCalculator().getMultiply())
                .elementClick(getCalculator().getNumber8())
                .elementClick(getCalculator().getEquals())
                .updateTextResultLocator("56");
        Assertions.assertTrue(getElementPage().getTextResult().isDisplayed());
    }
}
