package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;
        double square = length * height;
        return square;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
