package org.example.widgetMethods;

import org.example.FluentWait;
import org.example.elements.MainPage;
import org.example.page.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class BasketMethods extends PageFactory {
    private final MainPage mainPage = new MainPage(getDriver());
    private final FluentWait fluentWait = new FluentWait(getDriver());

    public BasketMethods(WebDriver driver) {
        super(driver);
    }

    public BasketMethods addInBasket(WebElement product) {
        Actions actions = new Actions(getDriver());

        actions.moveToElement(product)
                .pause(Duration.ofSeconds(1))
                .click(mainPage.getBasketWidget())
                .pause(Duration.ofSeconds(1))
                .perform();
        return this;
    }

    public BasketMethods search(String productName) {
        Actions actions = new Actions(getDriver());

        actions.click(mainPage.getSearchInput())
                .pause(Duration.ofSeconds(3))
                .sendKeys(productName)
                .pause(Duration.ofSeconds(3))
                .sendKeys(Keys.ENTER)
                .perform();
        return this;
    }

    public BasketMethods basketButtonClick() {
        mainPage.getBasketButtonHeader().click();
        return this;
    }

    public BasketMethods scrollToElement(WebElement scrollToElement) {
        fluentWait.fluentWaitLocators(ExpectedConditions.visibilityOf(scrollToElement));

        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", scrollToElement);
        return this;
    }
}
