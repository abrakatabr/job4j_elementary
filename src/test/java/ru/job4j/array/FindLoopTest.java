package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int e1 = 5;
        int result = FindLoop.indexOf(data, e1);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {5, 6, 7};
        int e1 = 10;
        int result = FindLoop.indexOf(data, e1);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}