package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when13To52Then4Point12() {
        Point a = new Point(1, 3);
        Point b = new Point(5, 2);
        double expected = 4.12;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1012ToMinus1Minus5Then20Point24() {
        Point a = new Point(10, 12);
        Point b = new Point(-1, -5);
        double expected = 20.24;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}