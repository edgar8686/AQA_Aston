package org.example.lesson_10;

import java.util.ArrayList;
import java.util.List;

import static org.example.lesson_10.Apple.getAppleWeight;
import static org.example.lesson_10.Orange.getOrangeWeight;

public class Box<T extends Fruit> {
    private List<T> list = new ArrayList<>();

    private Apple apple = new Apple();

    //private Orange orange = new Orange();
    public Box(List<T> fruit) {
        this.list = fruit;
    }

    public void getWeight() {
        double weight = 0.0f;
        double appleWeight = getAppleWeight();
        double orangeWeight = getOrangeWeight();
        for (var weightCount : list) {
            if (weightCount.toString().toLowerCase().equals("apple")) {
                weight += appleWeight;
                System.out.println(weightCount.toString());
            } else if (weightCount.toString().toLowerCase().equals("orange")) {
                weight += orangeWeight;
                System.out.println(weightCount.toString());
            }
        }
    }
}
