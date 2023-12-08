package org.example.elements;

import org.example.page.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends PageFactory {
    @FindBy(xpath = "//span[normalize-space()='Y17s 4+128GB']")
    private WebElement productPhoneName;
    @FindBy(xpath = "//span[contains(text(),'Ноутбук Acer EX215-22-R5D4 15.6/Ryzen 3/8Gb/(NX.EG')]")
    private WebElement productLaptopName;
    @FindBy(xpath = "//span[contains(@class,'good-info__good-name')][contains(text(),'Сортер Ежик Игрушка Спайк Монтессори')]")
    private WebElement productToyName;
    @FindBy(xpath = "//div[contains(text(),'10 450 ₽')]")
    private WebElement pricePhone;
    @FindBy(xpath = "//div[contains(text(),'31 431 ₽')]")
    private WebElement priceLaptop;
    @FindBy(xpath = "//div[contains(text(),'462 ₽')]")
    private WebElement priceToy;
    @FindBy(xpath = "//p[contains(@class,'b-top__total line')]//span//span[contains(text(),'42 343 ₽')]")
    private WebElement totalAmount;
    @FindBy(xpath = "//div[@class='b-top__count line']//span[1][contains(.,'Товары, 3 шт.')]")
    private WebElement quantity;

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getProductPhoneName() {
        return productPhoneName;
    }

    public WebElement getPricePhone() {
        return pricePhone;
    }

    public WebElement getTotalAmount() {
        return totalAmount;
    }

    public WebElement getQuantity() {
        return quantity;
    }

    public WebElement getPriceLaptop() {
        return priceLaptop;
    }

    public WebElement getPriceToy() {
        return priceToy;
    }

    public WebElement getProductLaptopName() {
        return productLaptopName;
    }

    public WebElement getProductToyName() {
        return productToyName;
    }
}
