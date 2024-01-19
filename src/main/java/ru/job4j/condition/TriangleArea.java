package ru.job4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double semiperimeter = (a + b + c) / 2;
        double square = Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
        return square;
    }

    public static void main(String[] args) {
        double result = TriangleArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
