package org.example.lesson_12;

import org.testng.annotations.DataProvider;

public class FactorialData {
    @DataProvider(name = "factorialData")
    public Object[][] factorialData() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {5, 120},
                {10, 3628800},
                {3, 6},
                {-1, 1},
        };
    }
}
