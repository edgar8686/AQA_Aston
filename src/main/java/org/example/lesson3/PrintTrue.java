package org.example.lesson3;

public class PrintTrue {
    public static boolean printTrue(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
