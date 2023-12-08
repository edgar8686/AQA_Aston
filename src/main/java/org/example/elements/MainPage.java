package org.example.elements;

import org.example.page.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageFactory {
    @FindBy(id = "searchInput")
    private WebElement searchInput;
    @FindBy(css = "a[aria-label='Y17s 4+128GB VIVO']")
    private WebElement phoneLocator;
    @FindBy(css = "a[aria-label='Ноутбук EX215-22-R5D4 15.6 Ryzen 3 8Gb (NX.EG9ER.02M) Acer']")
    private WebElement laptopLocator;
    @FindBy(css = "a[aria-label='Сортер Ежик Игрушка Спайк Монтессори MOS TOYS']")
    private WebElement toyLocator;
    @FindBy(xpath = "//article[@id='c188394599']//a[contains(@class,'product-card__add-basket j-add-to-basket btn-main-sm')]")
    private WebElement basketPhoneWidget;
    @FindBy(xpath = "//article[@id='c149763680']//a[@class='product-card__add-basket j-add-to-basket btn-main-sm']")
    private WebElement basketLaptopWidget;
    @FindBy(xpath = "//article[@id='c169875179']//a[@class='product-card__add-basket j-add-to-basket btn-main-sm']")
    private WebElement basketToyWidget;
    @FindBy(css = ".navbar-pc__icon.navbar-pc__icon--basket")
    private WebElement basketButtonHeader;

    public MainPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getPhoneLocator() {
        return phoneLocator;
    }

    public WebElement getBasketPhoneWidget() {
        return basketPhoneWidget;
    }

    public WebElement getBasketButtonHeader() {
        return basketButtonHeader;
    }

    public WebElement getLaptopLocator() {
        return laptopLocator;
    }

    public WebElement getToyLocator() {
        return toyLocator;
    }

    public WebElement getBasketLaptopWidget() {
        return basketLaptopWidget;
    }

    public WebElement getBasketToyWidget() {
        return basketToyWidget;
    }
}
