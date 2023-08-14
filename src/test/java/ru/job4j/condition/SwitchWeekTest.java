package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SwitchWeekTest {

    @Test
    void when1ThenMonday() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Monday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2ThenThuesday() {
        int day = 2;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Thuesday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when3ThenWednesday() {
        int day = 3;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Wednesday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when4ThenThursday() {
        int day = 4;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Thursday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when5ThenFriday() {
        int day = 5;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Friday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when6ThenSaturday() {
        int day = 6;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Saturday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when7ThenSunday() {
        int day = 7;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Sunday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when8ThenError() {
        int day = 8;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Error";
        assertThat(result).isEqualTo(expected);
    }
}