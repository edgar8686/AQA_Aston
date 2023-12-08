package org.example.tests;

import org.example.configuration.SeleniumConfig;
import org.junit.jupiter.api.Test;


public class BasketMethodsProductTest extends SeleniumConfig {
    @Test
    void basketProductTest() {
        getBasket().search("Телефон")
                .scrollToElement(getMainPage().getPhoneLocator())
                .addInBasket(getMainPage().getPhoneLocator(), getMainPage().getBasketPhoneWidget())
                .scrollToElement(getMainPage().getBasketButtonHeader())
                .deleteLine();

        getBasket().search("Ноутбук")
                .scrollToElement(getMainPage().getLaptopLocator())
                .addInBasket(getMainPage().getLaptopLocator(), getMainPage().getBasketLaptopWidget())
                .scrollToElement(getMainPage().getBasketButtonHeader())
                .deleteLine();

        getBasket().search("Игрушка")
                .scrollToElement(getMainPage().getToyLocator())
                .addInBasket(getMainPage().getToyLocator(), getMainPage().getBasketToyWidget())
                .scrollToElement(getMainPage().getBasketButtonHeader())
                .basketButtonClick();

        getAssertClass().assertBasket();
    }
}
