package org.example.configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.example.assertClass.AssertClass;
import org.example.elements.BasketPage;
import org.example.elements.MainPage;
import org.example.widget.BasketMethods;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SeleniumConfig {
    private static WebDriver driver;
    private final static String baseUrl = "https://www.wildberries.ru/";
    private final BasketMethods basketMethods = new BasketMethods(getDriver());
    private final MainPage mainPage = new MainPage(getDriver());
    private final BasketPage basketPage = new BasketPage(getDriver());
    private final AssertClass assertClass = new AssertClass(getDriver());

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


    public static WebDriver getDriver() {
        return driver;
    }

    public BasketMethods getBasket() {
        return basketMethods;
    }


    public MainPage getMainPage() {
        return mainPage;
    }

    public BasketPage getBasketPage() {
        return basketPage;
    }

    public AssertClass getAssertClass() {
        return assertClass;
    }
}
