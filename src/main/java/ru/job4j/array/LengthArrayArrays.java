package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {{2}, {4, 3}, {4, 2, 9}, {3, 1, 0, 5}};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Размер вложенного массива равен " + array[i].length);
        }
    }
}
