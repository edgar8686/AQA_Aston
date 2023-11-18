package org.example.lesson_10;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> list;

    private Apple apple = new Apple();

    private Orange orange = new Orange();

    public Box(List<T> fruit) {
        this.list = fruit;
    }

    public double getWeight() {
        double weight = 0.0f;
        for (var weightCount : list) {
            if (weightCount.toString().equalsIgnoreCase("apple")) {
                weight += apple.getAppleWeight();
            } else if (weightCount.toString().equalsIgnoreCase("orange")) {
                weight += orange.getOrangeWeight();
            }
        }
        return weight;
    }

    public String toString() {
        for (var weightCount : list) {
            if (weightCount.toString().equalsIgnoreCase("apple")) {
                return "Вес яблок равен: " + getWeight();
            } else if (weightCount.toString().equalsIgnoreCase("orange")) {
                return "Вес апельсинов равен: " + getWeight();
            }
        }
        return "Корзина пуста";
    }
}
