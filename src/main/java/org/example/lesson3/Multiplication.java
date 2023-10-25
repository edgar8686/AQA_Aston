package org.example.lesson3;

public class Multiplication {
    public static void multiplicationNumber() {
        int[] array = {2, 7, 54, 13, 22, 4, 11, 6, -23, 67, 31, 18, 0, 5, 3};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println();
        for (int a : array) {
            System.out.print(a);
            System.out.print(" ");
        }
    }
}
