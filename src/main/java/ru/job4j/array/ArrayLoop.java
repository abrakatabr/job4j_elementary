package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arrayInt = new int[5];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i * 2 + 3;
        }
        for (int number : arrayInt) {
            System.out.println(number);
        }
    }
}
