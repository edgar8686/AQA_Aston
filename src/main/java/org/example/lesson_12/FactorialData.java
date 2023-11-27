package org.example.lesson_12;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class FactorialData {
    public static Stream<Arguments> factorialData() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(10, 3628800),
                Arguments.of(3, 6),
                Arguments.of(-1, 1)
        );
    }
}
