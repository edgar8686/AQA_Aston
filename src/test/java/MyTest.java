import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.example.lesson_12.Factorial.calculateFactorial;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @ParameterizedTest
    @MethodSource("org.example.lesson_12.FactorialData#factorialData")
    public void testCalculateFactorial(int input, long expectedFactorial) throws IllegalArgumentException {
        long actualFactorial = calculateFactorial(input);
        System.out.println(input);
        assertEquals(expectedFactorial, actualFactorial,
                "Факториал для входного значения " + input + " неверен");
    }
}
