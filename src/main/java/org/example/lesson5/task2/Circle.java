package org.example.lesson5.task2;

public class Circle implements Calculation {
    private final double radius = 1.3;
    private final String backgroundColor = "blue";
    private final String borderColor = "yellow";

    public void calculationPerimeterAndArea() {
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter circle: " + perimeter);
        System.out.println("Area circle: " + area);
        System.out.println("BackgroundColor circle: " + backgroundColor);
        System.out.println("BorderColor circle: " + borderColor);
        System.out.println();
    }
}
