package org.example.lesson_17.page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.example.lesson_17.FactoryInit;
import org.openqa.selenium.WebElement;

public class ElementsCalculator extends FactoryInit {
    @AndroidFindBy(accessibility = "0")
    private WebElement number0;
    @AndroidFindBy(accessibility = "1")
    private WebElement number1;
    @AndroidFindBy(accessibility = "2")
    private WebElement number2;
    @AndroidFindBy(accessibility = "3")
    private WebElement number3;
    @AndroidFindBy(accessibility = "4")
    private WebElement number4;
    @AndroidFindBy(accessibility = "5")
    private WebElement number5;
    @AndroidFindBy(accessibility = "6")
    private WebElement number6;
    @AndroidFindBy(accessibility = "7")
    private WebElement number7;
    @AndroidFindBy(accessibility = "8")
    private WebElement number8;
    @AndroidFindBy(accessibility = "9")
    private WebElement number9;
    @AndroidFindBy(accessibility = "plus")
    private WebElement plus;
    @AndroidFindBy(accessibility = "minus")
    private WebElement minus;
    @AndroidFindBy(accessibility = "multiply")
    private WebElement multiply;
    @AndroidFindBy(accessibility = "divide")
    private WebElement divide;
    @AndroidFindBy(accessibility = "equals")
    private WebElement equals;

    public ElementsCalculator(AndroidDriver driver) {
        super(driver);
    }

    public WebElement getNumber0() {
        return number0;
    }

    public WebElement getNumber1() {
        return number1;
    }

    public WebElement getNumber2() {
        return number2;
    }

    public WebElement getNumber3() {
        return number3;
    }

    public WebElement getNumber4() {
        return number4;
    }

    public WebElement getNumber5() {
        return number5;
    }

    public WebElement getNumber6() {
        return number6;
    }

    public WebElement getNumber7() {
        return number7;
    }

    public WebElement getNumber8() {
        return number8;
    }

    public WebElement getNumber9() {
        return number9;
    }

    public WebElement getPlus() {
        return plus;
    }

    public WebElement getMinus() {
        return minus;
    }

    public WebElement getMultiply() {
        return multiply;
    }

    public WebElement getDivide() {
        return divide;
    }

    public WebElement getEquals() {
        return equals;
    }

}
