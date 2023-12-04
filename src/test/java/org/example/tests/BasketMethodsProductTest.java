package org.example.tests;

import org.example.configuration.SeleniumConfig;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;


public class BasketMethodsProductTest extends SeleniumConfig {
    @Test
    void basketProductTest() throws InterruptedException {
        getBasket().search("Телефон");
        getBasket().scrollToElement(getMainPage().getPhoneLocator());
        getBasket().addInBasket(getMainPage().getPhoneLocator());
        getBasket().scrollToElement(getMainPage().getBasketButtonHeader());
        getBasket().basketButtonClick();
        getAssertClass().assertBasket();
    }
}
