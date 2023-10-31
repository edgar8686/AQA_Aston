package org.example;

import org.example.lesson5.task1.Cat;
import org.example.lesson5.task1.Dog;
import org.example.lesson5.task2.Calculation;
import org.example.lesson5.task2.Circle;
import org.example.lesson5.task2.Rectangle;
import org.example.lesson5.task2.Triangle;

public class Lesson5 {
    public static void main(String[] args) {
        Cat cat = new Cat(6, 5);
        cat.plateEat();
        cat.addEat(2);
        cat.plateEat();

        Dog dog = new Dog(5, 3);
        dog.plateEat();
        dog.addEat(2);
        dog.plateEat();

        Calculation calculationCircle = new Circle();
        Calculation calculationTriangle = new Triangle(10,20,15);
        Calculation calculationRectangle = new Rectangle(5,30);

        calculationCircle.calculationPerimeterAndArea();
        calculationRectangle.calculationPerimeterAndArea();
        calculationTriangle.calculationPerimeterAndArea();
    }
}