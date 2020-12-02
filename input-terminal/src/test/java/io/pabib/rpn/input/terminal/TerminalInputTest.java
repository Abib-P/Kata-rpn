package io.pabib.rpn.input.terminal;

import io.pabib.rpn.input.Input;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class TerminalInputTest {

    @Test
    void input_should_return_null_given_empty_input() {
        Input input = givenAnInputForString("");

        String result = input.getInput();

        assertThat(result).isEqualTo(null);
    }

    @Test
    void input_should_return_string_given_string_input() {
        Input input = givenAnInputForString("1 2 +");

        String result = input.getInput();

        assertThat(result).isEqualTo("1 2 +");
    }

    @Test
    void input_should_return_first_line_given_multiple_line_input() {
        Input input = givenAnInputForString("5 2 +\n3 + -");

        String firstLine = input.getInput();
        String secondLine = input.getInput();

        assertThat(firstLine).isEqualTo("5 2 +");
        assertThat(secondLine).isEqualTo("3 + -");
    }

    private Input givenAnInputForString(String givenString) {
        InputStream inputStream = new ByteArrayInputStream(givenString.getBytes());
        return new TerminalInput(inputStream);
    }
}
