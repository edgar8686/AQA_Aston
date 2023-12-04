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
    @FindBy(css = "a[aria-label='Ноутбук 14\" IPS 4-Ядра 8GB SSD 256GB ']")
    private WebElement laptopLocator;
    @FindBy(xpath = "//article[@id='c188394599']//a[contains(@class,'product-card__add-basket j-add-to-basket btn-main-sm')]")
    private WebElement basketWidget;
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

    public WebElement getBasketWidget() {
        return basketWidget;
    }

    public WebElement getBasketButtonHeader() {
        return basketButtonHeader;
    }

    public WebElement getLaptopLocator() {
        return laptopLocator;
    }

}
