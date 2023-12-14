package lesson_17;

import config.AndroidConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorMinusResultTest extends AndroidConfig {
    @Test
    void calculatorMinusTest() {
        getElementPage().elementClick(getCalculator().getNumber4())
                .elementClick(getCalculator().getMinus())
                .elementClick(getCalculator().getNumber1())
                .elementClick(getCalculator().getEquals())
                .updateTextResultLocator("3");
        Assertions.assertTrue(getElementPage().getTextResult().isDisplayed());
    }
}
