package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenWomanHeight187ThenWeight88and55() {
        short height = 187;
        double expected = 88.55;
        double out = Fit.womanWeight(height);
        assertThat(out).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenManHeight160ThenWeight69() {
        short height = 160;
        double expected = 69.0;
        double out = Fit.manWeight(height);
        assertThat(out).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenWomanHeight160ThenWeight57and5() {
        short height = 160;
        double expected = 57.5;
        double out = Fit.womanWeight(height);
        assertThat(out).isCloseTo(expected, within(0.01));
    }

    @Test
    void whenHeightZeroThenIllegalArgumentException() {
        short height = 0;
        assertThatThrownBy(() -> Fit.manWeight(height))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Height must be greater than zero");

        assertThatThrownBy(() -> Fit.womanWeight(height))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Height must be greater than zero");
    }
}