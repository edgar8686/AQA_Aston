package org.example;


import org.example.lesson7.MyArrayDataException;
import org.example.lesson7.MyArraySizeException;

import static org.example.lesson7.ExceptionArray.array;

public class Lesson7 {
    public static void main(String[] args) {
        String[][] str = new String[][]{{"12", "15", "756", "exit"}, {"23", "657", "345", "679"}, {"23", "34", "90", "98"}, {"456", "34", "87", "76"}};
        try {
            System.out.println(array(str));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}