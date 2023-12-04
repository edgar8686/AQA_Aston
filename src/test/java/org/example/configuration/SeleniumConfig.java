package org.example.configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.example.elements.BlockOnlineReplenishment;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.net.MalformedURLException;
import java.time.Duration;

public class SeleniumConfig {
    private static WebDriver driver;
    private final static String baseUrl = "http://mts.by/";
    BlockOnlineReplenishment block = new BlockOnlineReplenishment(getDriver());

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
    }

    @BeforeEach
    void start() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        getDriver().navigate().to(baseUrl);
        System.out.println("Start on Chrome");
    }

    @AfterAll
    static void close() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            System.out.println("Cookies are deleted");
            driver.close();
            System.out.println("The browser is closed");
            driver.quit();
            System.out.println("The driver is quit");
            Allure.step("Driver is quit");
        }
    }

    public void acceptAllCookies() {
        try {
            block.fluentWaitLocators(ExpectedConditions.elementToBeClickable(block.getCookieAgree()));
            if (block.getCookieAgree().isDisplayed()) {
                block.getCookieAgree().click();
                System.out.println("All cookies accepted");
            }
        } catch (TimeoutException | NoSuchElementException e) {
            System.out.println("All cookies have been accepted");
        }
    }

    public BlockOnlineReplenishment getBlock() {
        return block;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
