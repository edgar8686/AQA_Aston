package org.example.tests;

import org.example.configuration.SeleniumConfig;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;


public class BasketMethodsProductTest extends SeleniumConfig {
    @Test
    void basketProductTest() {
        getBasket().search("Телефон");
        getBasket().scrollToElement(getMainPage().getPhoneLocator());
        getBasket().addInBasket(getMainPage().getPhoneLocator(), getMainPage().getBasketPhoneWidget());
        getBasket().scrollToElement(getMainPage().getBasketButtonHeader());
        getBasket().deleteLine();

        getBasket().search("Ноутбук");
        getBasket().scrollToElement(getMainPage().getLaptopLocator());
        getBasket().addInBasket(getMainPage().getLaptopLocator(), getMainPage().getBasketLaptopWidget());
        getBasket().scrollToElement(getMainPage().getBasketButtonHeader());
        getBasket().deleteLine();

        getBasket().search("Игрушка");
        getBasket().scrollToElement(getMainPage().getToyLocator());
        getBasket().addInBasket(getMainPage().getToyLocator(),getMainPage().getBasketToyWidget());
        getBasket().scrollToElement(getMainPage().getBasketButtonHeader());

        getBasket().basketButtonClick();
        getAssertClass().assertBasket();
    }
}
