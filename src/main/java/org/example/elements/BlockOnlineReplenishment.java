package org.example.elements;

import org.example.page.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static io.qameta.allure.internal.shadowed.jackson.databind.type.LogicalType.Collection;

public class BlockOnlineReplenishment extends Page {
    @FindBy(id = "cookie-agree")
    private WebElement cookieAgree;
    @FindBy(xpath = "//h2[contains(normalize-space(),'Онлайн пополнение без комиссии')]")
    private WebElement onlineReplenishment;
    @FindBy(css = ".pay__wrapper")
    private WebElement blockOnline;
    @FindAll({
            @FindBy(xpath = "//img[@alt='Visa']"),
            @FindBy(xpath = "//img[@alt='Verified By Visa']"),
            @FindBy(xpath = "//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg'][contains(@alt,'MasterCard')]"),
            @FindBy(xpath = "//img[@alt='MasterCard Secure Code']"),
            @FindBy(xpath = "//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg'][contains(@alt,'Белкарт')]"),
            @FindBy(xpath = "//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mir.svg'][contains(@alt,'МИР')]")
    })
    private List<WebElement> logos;
    @FindAll({
            @FindBy(css = ".gpay-button black plain short ru"),
            @FindBy(css = ".ya-pay-button ya-pay-button_black"),
            @FindBy(css = ".input[formcontrolname='creditCard']"),
            @FindBy(css = ".content ng-tns-c47-4"),
            @FindBy(css = ".content ng-tns-c47-5"),
            @FindBy(css = ".content ng-tns-c47-3"),
            @FindBy(css = ".switch-track ng-tns-c50-2")
    })
    private List<WebElement> form;
    @FindAll({
            @FindBy(xpath = "//span[contains(text(),'Порядок оплаты и безопасность интернет платежей')]"),
            @FindBy(xpath = "//h3[contains(text(),'Оплата банковской картой')]")
    })
    private List<WebElement> workLink;
    @FindBy(xpath = "//a[contains(text(),'Подробнее о сервисе')]")
    private WebElement link;
    @FindBy(id = "connection-phone")
    private WebElement connectionPhone;
    @FindBy(id = "connection-sum")
    private WebElement connectionSum;
    @FindBy(css = "form[id='pay-connection'] button[type='submit']")
    private WebElement submit;
    @FindBy(css = ".select__header")
    private WebElement selectHeader;
    @FindBy(xpath = "//p[@class='select__option'][normalize-space()='Услуги связи']")
    private WebElement selectOption1;
    @FindBy(xpath = "//p[@class='select__option'][normalize-space()='Домашний интернет']")
    private WebElement selectOption2;
    @FindBy(xpath = "//p[@class='select__option'][normalize-space()='Рассрочка']")
    private WebElement selectOption3;
    @FindBy(xpath = "//p[@class='select__option'][normalize-space()='Задолженность']")
    private WebElement selectOption4;
    @FindBy(xpath = "//span[@class='select__now'][contains(normalize-space(),'Услуги связи')]")
    private WebElement selectOptionHeader1;
    @FindBy(xpath = "//span[@class='select__now'][contains(normalize-space(),'Домашний интернет')]")
    private WebElement selectOptionHeader2;
    @FindBy(xpath = "//span[@class='select__now'][contains(normalize-space(),'Рассрочка')]")
    private WebElement selectOptionHeader3;
    @FindBy(xpath = "//span[@class='select__now'][contains(normalize-space(),'Задолженность')]")
    private WebElement selectOptionHeader4;
    private final String phoneNumber = "(29)777-77-77";
    private final String sum = "100";

    public BlockOnlineReplenishment(WebDriver driver) {
        super(driver);
    }

    public BlockOnlineReplenishment onlineReplenishmentPage() {
        fluentWaitLocators(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".pay__wrapper")));
        new Actions(getDriver())
                .pause(Duration.ofSeconds(1))
                .moveToElement(blockOnline)
                .pause(Duration.ofSeconds(1))
                .perform();
        return this;
    }

    public void clickContinue() {
        new Actions(getDriver())
                .click(getConnectionPhone())
                .sendKeys(getPhoneNumber())
                .pause(Duration.ofSeconds(1))
                .click(getConnectionSum())
                .sendKeys(getSum())
                .pause(Duration.ofSeconds(1))
                .click(submit)
                .perform();
    }

    public void selectNow(WebElement selectOption) {
        new Actions(getDriver())
                .click(getSelectHeader())
                .pause(Duration.ofSeconds(1))
                .click(selectOption)
                .pause(Duration.ofSeconds(1))
                .perform();
    }

    public BlockOnlineReplenishment linkClick() {
        fluentWaitLocators(ExpectedConditions.elementToBeClickable(link));
        link.click();
        return this;
    }

    public void fluentWaitLocators(ExpectedCondition<WebElement> conditions) {
        Wait<WebDriver> wait = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofSeconds(15))
                .ignoring(NoSuchElementException.class);
        wait.until(conditions);
    }


    public WebElement getCookieAgree() {
        return cookieAgree;
    }

    public WebElement getOnlineReplenishment() {
        return onlineReplenishment;
    }

    public List<WebElement> getLogos() {
        return logos;
    }

    public List<WebElement> getWorkLink() {
        return workLink;
    }

    public WebElement getBlockOnline() {
        return blockOnline;
    }

    public WebElement getConnectionPhone() {
        return connectionPhone;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getConnectionSum() {
        return connectionSum;
    }

    public WebElement getSubmit() {
        return submit;
    }

    public String getSum() {
        return sum;
    }

    public List<WebElement> getForm() {
        return form;
    }

    public WebElement getSelectHeader() {
        return selectHeader;
    }

    public List<WebElement> getSelectOption() {
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(selectOption1);
        webElements.add(selectOption2);
        webElements.add(selectOption3);
        webElements.add(selectOption4);
        return webElements;
    }
    public List<WebElement> getSelectOptionHeader() {
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(selectOptionHeader1);
        webElements.add(selectOptionHeader2);
        webElements.add(selectOptionHeader3);
        webElements.add(selectOptionHeader4);
        return webElements;
    }
}
