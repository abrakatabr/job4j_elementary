package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int expected = 2;
        int result = Max.max(first, second);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To1Then3() {
        int first = 3;
        int second = 1;
        int expected = 3;
        int result = Max.max(first, second);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int first = 3;
        int second = 3;
        int expected = 3;
        int result = Max.max(first, second);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To1To2Then3() {
        int first = 3;
        int second = 1;
        int third = 2;
        int expected = 3;
        int result = Max.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To1To2To4Then4() {
        int first = 3;
        int second = 1;
        int third = 2;
        int fourth = 4;
        int expected = 4;
        int result = Max.max(first, second, third, fourth);
        assertThat(result).isEqualTo(expected);
    }
}