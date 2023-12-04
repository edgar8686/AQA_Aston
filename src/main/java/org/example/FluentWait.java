package org.example;

import io.qameta.allure.Allure;
import org.example.page.PageFactory;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWait extends PageFactory {
    public FluentWait(WebDriver driver) {
        super(driver);
    }

    public void fluentWaitLocators(ExpectedCondition<WebElement> conditions) {
        Wait<WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<>(getDriver())
                .pollingEvery(Duration.ofSeconds(2))
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class, ElementClickInterceptedException.class);
        try {
            wait.until(conditions);
        } catch (Exception e) {
            Allure.step("Исключение было проигнорировано: " + e.getMessage());
        }
    }
}
