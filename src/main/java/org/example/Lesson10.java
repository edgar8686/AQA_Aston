package org.example;

import org.example.lesson_10.Apple;
import org.example.lesson_10.Box;
import org.example.lesson_10.Orange;

import java.util.ArrayList;
import java.util.List;

public class Lesson10 {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        Box<Apple> appleBox =new Box<>(appleList);
    }
}