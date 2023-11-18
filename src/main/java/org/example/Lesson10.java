package org.example;

import org.example.lesson_10.Apple;
import org.example.lesson_10.Box;
import org.example.lesson_10.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson10 {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>(Arrays.asList(new Apple(), new Apple(), new Apple()));
        Box<Apple> appleBox = new Box<>(appleList);
        List<Orange> orangeList = new ArrayList<>(Arrays.asList(new Orange(), new Orange(), new Orange(), new Orange()));
        Box<Orange> orangeBox = new Box<>(orangeList);
        System.out.println(appleBox.toString());
        System.out.println(orangeBox.toString());

    }
}