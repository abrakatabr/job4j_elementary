package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int e1) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == e1) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int element, int start, int finish) {
        int result = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }
}
