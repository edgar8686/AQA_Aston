package org.example.lesson_17.elementPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.example.lesson_17.FactoryInit;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


public class ElementPage extends FactoryInit {
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='%s']")
    private WebElement textResult;

    public ElementPage(AndroidDriver driver) {
        super(driver);
    }

    public ElementPage elementClick(WebElement elementClick) {
        elementClick.click();
        return this;
    }

    public void updateTextResultLocator(String newText) {
        try {
            String updatedXpath = String.format("//*[@text='%s']", newText);
            textResult = getAndroidDriver().findElement(By.xpath(updatedXpath));
        } catch (NoSuchElementException e) {
            Assertions.fail("Элемент с текстом '" + newText + "' не был найден");
        }
    }

    public WebElement getTextResult() {
        return textResult;
    }
}
