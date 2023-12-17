package lesson_17;

import config.AndroidConfig;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CalculatorPlusResultTest extends AndroidConfig {
    @Test
    @Tag("Plus Test")
    @Severity(SeverityLevel.CRITICAL)
    void calculatorPlusTest() {
        getElementPage().elementClick(getCalculator().getNumber9())
                .elementClick(getCalculator().getPlus())
                .elementClick(getCalculator().getNumber3())
                .elementClick(getCalculator().getEquals())
                .updateTextResultLocator("12");
        Assertions.assertTrue(getElementPage().getTextResult().isDisplayed());
    }
}
