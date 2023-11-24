package org.example;

import org.checkerframework.checker.units.qual.A;
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

        List<Apple> appleList2 = new ArrayList<>(Arrays.asList(new Apple(), new Apple(), new Apple()));
        Box<Apple> appleBox2 = new Box<>(appleList2);

        List<Orange> orangeList = new ArrayList<>(Arrays.asList(new Orange(), new Orange(), new Orange(), new Orange()));
        Box<Orange> orangeBox = new Box<>(orangeList);

        //Метод высчитывания веса коробок
        //Проверка работы с выводом в консоль
        System.out.println(appleBox);
        System.out.println(appleBox2);
        System.out.println(orangeBox);

        //Метод сравнивания веса коробок без учета какие именно фрукты в коробке
        //Проверка работы с выводом в консоль
        System.out.println(appleBox.compare(appleBox2));
        System.out.println(orangeBox.compare(appleBox));

        //Метод пересыпания фруктов с учетом какие фрукты в коробке
        appleBox.pourOverFruit(appleBox2);

        //Проверка работы с выводом в консоль
        System.out.println(appleBox);
        System.out.println(appleBox2);
        System.out.println(orangeBox);

        //Метод добавления фрукта в коробку с учетом какие фрукты лежат в коробке
        appleBox2.addFruit(new Apple());
        orangeBox.addFruit(new Orange());

        //Проверка работы с выводом в консоль
        System.out.println(appleBox);
        System.out.println(appleBox2);
        System.out.println(orangeBox);


    }
}