package org.example.lesson5.task2;

public class Triangle implements Calculation {
    private double a;
    private double b;
    private double c;
    private final String backgroundColor = "violet";
    private final String borderColor = "gray";

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculationPerimeterAndArea() {
        double p = (a + b + c) / 2;
        double perimeter = a + b + c;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        ;
        System.out.println("Perimeter triangle: " + perimeter);
        System.out.println("Area triangle: " + area);
        System.out.println("BackgroundColor triangle: " + backgroundColor);
        System.out.println("BorderColor triangle: " + borderColor);
        System.out.println();
    }
}
