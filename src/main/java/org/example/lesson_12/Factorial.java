package org.example.lesson_12;

public class Factorial {
    public static long calculateFactorial(int n) throws IllegalArgumentException {
        System.out.println();
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел");
        }

        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
