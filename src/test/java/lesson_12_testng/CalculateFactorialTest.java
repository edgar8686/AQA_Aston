package lesson_12_testng;

import org.example.lesson_12.FactorialData;
import org.testng.annotations.Test;

import static org.example.lesson_12.Factorial.calculateFactorial;
import static org.testng.Assert.assertEquals;

public class CalculateFactorialTest {
    @Test(dataProvider = "factorialData", dataProviderClass = FactorialData.class)
    public void testCalculateFactorial(int input, long expectedFactorial) throws IllegalArgumentException {
        long actualFactorial = calculateFactorial(input);
        System.out.println(actualFactorial + " " + expectedFactorial);
        assertEquals(actualFactorial, expectedFactorial,
                "Факториал для входного значения " + input + " неверен");
    }
}
