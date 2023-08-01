package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rs1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rs1;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        double result2 = Point.distance(1, 3, 5, 2);
        System.out.println("result (1, 3) to (5, 2) " + result2);
        double result3 = Point.distance(10, 12, -1, -5);
        System.out.println("result (10, 12) to (-1, -5) " + result3);
    }
}
