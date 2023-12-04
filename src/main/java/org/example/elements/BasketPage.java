package org.example.elements;

import org.example.page.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends PageFactory {
    @FindBy(xpath = "//span[normalize-space()='Y17s 4+128GB']")
    private WebElement productName;
    @FindBy(xpath = "//div[contains(text(),'10 072 ₽')]")
    private WebElement pricePhone;
    @FindBy(xpath = "//p[contains(@class,'b-top__total line')]//span//span[contains(text(),'10 072 ₽')]")
    private WebElement totalAmount;
    @FindBy(xpath = "//div[@class='b-top__count line']//span[1][contains(.,'Товары, 1 шт.')]")
    private WebElement quantity;

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getProductName() {
        return productName;
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
}
