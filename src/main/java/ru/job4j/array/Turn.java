package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        int temp;
        for (int index = 0; index < array.length - index; index++) {
            temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
        return array;
    }
}