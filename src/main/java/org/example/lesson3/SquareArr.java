package org.example.lesson3;

public class SquareArr {
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
}
