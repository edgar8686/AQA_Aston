package org.example.lesson3;

public class Year {
    public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Високосный год");
            return true;
        } else {
            System.out.println("Не високосный год");
            return false;
        }
    }

}
