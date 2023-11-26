import static org.example.lesson_12.Factorial.calculateFactorial;

public class MyTest {
    @ParameterizedTest
    @MethodSource("factorialData")
    public void testCalculateFactorial(int input, long expectedFactorial) throws IllegalArgumentException {
        long actualFactorial = calculateFactorial(input);
        assertEquals(expectedFactorial, actualFactorial,
                "Факториал для входного значения " + input + " неверен");
    }
}
