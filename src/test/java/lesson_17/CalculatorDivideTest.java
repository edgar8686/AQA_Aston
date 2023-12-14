package lesson_17;

import config.AndroidConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorDivideTest extends AndroidConfig {
    @Test
    void calculatorDivideTest() {
        getElementPage().elementClick(getCalculator().getNumber5())
                .elementClick(getCalculator().getNumber0())
                .elementClick(getCalculator().getDivide())
                .elementClick(getCalculator().getNumber1())
                .elementClick(getCalculator().getNumber0())
                .elementClick(getCalculator().getEquals())
                .updateTextResultLocator("5");
        Assertions.assertTrue(getElementPage().getTextResult().isDisplayed());
    }
}
