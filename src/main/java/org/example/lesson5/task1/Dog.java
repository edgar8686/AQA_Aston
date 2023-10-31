package org.example.lesson5.task1;

import org.example.lesson5.task1.Animal;

public class Dog extends Animal {
    private int dog;
    private int quantityEat;

    public Dog(int dog, int quantityEat) {
        this.dog = dog;
        this.quantityEat = quantityEat;
    }

    public void run(int distance) {
        if (distance > 500) {
            System.out.println("Собака не может бежать больше " + distance);
        } else {
            System.out.println("Собака пробежала: " + distance);
        }
    }

    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Собака не может плыть больше " + distance);
        } else {
            System.out.println("Собака проплыла: " + distance);
        }
    }

    public void plateEat() {
        int count = quantityEat;
        boolean[] satiety = new boolean[dog];
        if (quantityEat > dog) {
            System.out.println("Еды больше, чем собак");
            return;
        }
        for (int i = 0; i < satiety.length; i++) {
            count -= 1;
            if (count < 0) {
                satiety[i] = false;
            } else {
                satiety[i] = true;
            }
        }
        if (count < 0) {
            count = dog - quantityEat;
            System.out.println("Не удалось поесть: " + count + " собакам");
            System.out.println("Сыты собак: " + quantityEat);
            System.out.println("Список сытых и голодных собак:");
            for (var cat : satiety) {
                System.out.println(cat);
            }
            System.out.println("Можете добавить еду кому не досталось с помщью метода addEat");
        } else {
            System.out.println("Все сытых: " + dog + " собак");
            System.out.println("Список сытых и голодных собак:");
            for (var dog : satiety) {
                System.out.println(dog);
            }
        }
    }

    public void addEat(int countEat) {
        quantityEat += countEat;
        System.out.println("Добавлено еды" + countEat);
    }
}
