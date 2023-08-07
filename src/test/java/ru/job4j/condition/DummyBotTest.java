package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String in = "Hi, Bot.";
        String expected = "Hi, SmartAss.";
        String out = DummyBot.answer(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String in = "Bye.";
        String expected = "See you later.";
        String out = DummyBot.answer(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenUnknownBot() {
        String in = "Hello!";
        String expected = "I don't know. Please, ask another question.";
        String out = DummyBot.answer(in);
        assertThat(out).isEqualTo(expected);
    }
}