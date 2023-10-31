package org.example.lesson5.task1;

import org.example.lesson5.task1.Animal;

public class Cat extends Animal {
    private int cat;
    private int quantityEat;

    public Cat(int cat, int quantityEat) {
        this.cat = cat;
        this.quantityEat = quantityEat;
    }

    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Котяра не может бежать больше " + distance);
        } else {
            System.out.println("Котяра пробежала: " + distance);
        }
    }

    public void swim(int distance) {
        System.out.println("Котяра не умеет плавать");
    }

    public void plateEat() {
        int count = quantityEat;
        boolean[] satiety = new boolean[cat];
        if (quantityEat > cat) {
            System.out.println("Еды больше, чем котяр. Уменьшите количество еды");
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
            count = cat - quantityEat;
            System.out.println("Не удалось поесть: " + count + " котярам");
            System.out.println("Сыты котяр: " + quantityEat);
            System.out.println("Список сытых и голодных котяр:");
            for (var cat : satiety) {
                System.out.println(cat);
            }
            System.out.println("Можете добавить еду кому не досталось с помщью метода addEat");
        } else {
            System.out.println("Все сыты: " + cat + " котяр");
            System.out.println("Список сытых и голодных котяр:");
            for (var cat : satiety) {
                System.out.println(cat);
            }
        }
    }

    public void addEat(int countEat) {
        quantityEat += countEat;
    }
}
