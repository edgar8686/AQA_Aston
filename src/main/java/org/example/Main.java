package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printTrue(10, 11);
        printNumber(-123);
        printNumberTrue(3);
        printString("Привет!", 10);
        leapYear(2024);
        array();
        arrayNumber();
        multiplicationNumber();
        squareArray();
        System.out.print(Arrays.toString(oneDimensionalArray(10,11)));
    }

    //Задание 1
    public static boolean printTrue(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    //Задание 2
    public static void printNumber(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    //Задание 3
    public static boolean printNumberTrue(int a) {
        if (a < 0) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    //Задание 4
    public static void printString(String str, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(str);
        }
    }

    //Задание 5
    public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Високосный год");
            return true;
        } else {
            System.out.println("Не високосный год");
            return false;
        }
    }

    //Задание 6
    public static void array() {
        int[] array = {1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array[i] == 0) {
                array[i] = 1;
            }
        }
        for (var a : array) {
            System.out.print(a);
        }
    }

    //Задание 7
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

    //Задание 8
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

    //Ошибка в задании 9. Повторяет задание 8
    //Задание 10
    public static void squareArray() {
        int[][] array = new int[5][5];
        int a = 5 - 1;
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
                if (j == a) {
                    array[i][j] = 1;
                    a -= 1;
                }
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //Задание 11
    public static int[] oneDimensionalArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}