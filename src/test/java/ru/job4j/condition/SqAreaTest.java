package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP16K3Then12() {
        int p = 16;
        double k = 3;
        double expected = 12;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP20K4Then16() {
        int p = 20;
        double k = 4;
        double expected = 16;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}