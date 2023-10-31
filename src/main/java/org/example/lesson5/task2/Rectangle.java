package org.example.lesson5.task2;

public class Rectangle implements Calculation {
    private double length;
    private double width;
    private final String backgroundColor = "pink";
    private final String borderColor = "red";

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void calculationPerimeterAndArea() {
        double perimeter = (length + width) * 2;
        double area = length * width;
        System.out.println("Perimeter rectangle: " + perimeter);
        System.out.println("Area rectangle: " + area);
        System.out.println("BackgroundColor rectangle: " + backgroundColor);
        System.out.println("BorderColor rectangle: " + borderColor);
        System.out.println();
    }
}
