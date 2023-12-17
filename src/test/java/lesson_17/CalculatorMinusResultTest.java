package lesson_17;

import config.AndroidConfig;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CalculatorMinusResultTest extends AndroidConfig {
    @Test
    @Tag("Minus Test")
    @Severity(SeverityLevel.CRITICAL)
    void calculatorMinusTest() {
        getElementPage().elementClick(getCalculator().getNumber4())
                .elementClick(getCalculator().getMinus())
                .elementClick(getCalculator().getNumber1())
                .elementClick(getCalculator().getEquals())
                .updateTextResultLocator("3");
        Assertions.assertTrue(getElementPage().getTextResult().isDisplayed());
    }
}
