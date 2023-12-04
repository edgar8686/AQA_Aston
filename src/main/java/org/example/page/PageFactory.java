package org.example.page;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    private WebDriver driver;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
        org.openqa.selenium.support.PageFactory.initElements(driver, this);
    }

    protected WebDriver getDriver() {
        return this.driver;
    }
}
