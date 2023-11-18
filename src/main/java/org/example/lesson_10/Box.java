package org.example.lesson_10;


import java.util.List;

public class Box<T extends Fruit> {
    private List<T> list;

    private Apple apple = new Apple();

    private Orange orange = new Orange();

    public Box(List<T> fruit) {
        this.list = fruit;
    }

    //Метод высчитывания веса коробок
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
                return "Вес " + apple.getClass().getSimpleName() + " равен: " + getWeight();
            } else if (weightCount.toString().equalsIgnoreCase("orange")) {
                return "Вес " + orange.getClass().getSimpleName() + " равен: " + getWeight();
            } else if (list.isEmpty()) {
                return "Коробка пустая";
            }
        }
        return "Вес коробки: " + getWeight();
    }

    //Метод сравнения веса коробок без учета какие фрукты в коробке
    public boolean compare(Box<? extends Fruit> fruit) {
        return Math.abs(this.getWeight() - fruit.getWeight()) < 0.0001;
    }

    //Метод пересыпания фруктов с учетом какие фрукты в коробке
    public void pourOverFruit(Box<T> otherBox) {
        this.list.addAll(otherBox.list);
        otherBox.list.clear();
    }

    //Метод добавления фруктов
    public void addFruit(T fruit) {
        this.list.add(fruit);
    }
}
