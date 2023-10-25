package org.example.lesson3;

public class ArrNumber {
    public static void arrayNumber() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println();
        for (var a : array) {
            System.out.print(a);
            System.out.print(" ");
        }
    }
}
