package org.example.lesson7;

public class ExceptionArray {
    public static int array(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке " + "[" + i + "]" + "[" + j + "]" + " лежат неверные данные");
                }
                if (arr.length != 4 || arr[i].length != 4) {
                    throw new MyArraySizeException("Размер массива неверный: " + arr.length + "*" + arr[i].length);
                }
            }
        }
        return count;
    }
}
