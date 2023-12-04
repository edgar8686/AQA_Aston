package org.example.assertClass;

import org.example.elements.BasketPage;
import org.example.page.PageFactory;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class AssertClass extends PageFactory {
    private BasketPage basketPage = new BasketPage(getDriver());
    public AssertClass(WebDriver driver) {
        super(driver);
    }
    public void assertBasket() {
        Assertions.assertTrue(basketPage.getProductName().isDisplayed());
        Assertions.assertTrue(basketPage.getPricePhone().isDisplayed());
        Assertions.assertTrue(basketPage.getTotalAmount().isDisplayed());
        Assertions.assertTrue(basketPage.getQuantity().isDisplayed());
    }
}
