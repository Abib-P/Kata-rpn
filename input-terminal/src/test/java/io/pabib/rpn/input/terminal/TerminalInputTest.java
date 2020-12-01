package io.pabib.rpn.input.terminal;

import io.pabib.rpn.input.Input;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.Mock;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class TerminalInputTest {

    InputStream inputStream;

    Input input;

    @BeforeEach
    public void init(){
        String stringAsInput = "add 5";
        inputStream = new ByteArrayInputStream(stringAsInput.getBytes());
        input = new TerminalInput(inputStream);
    }

    @Test
    void input_should_return_null_for_empty_entry() {
        String stringAsInput = "";
        inputStream = new ByteArrayInputStream(stringAsInput.getBytes());
        input = new TerminalInput(inputStream);
        assertThat(input.getInput()).isEqualTo(null);
    }

    @Test
    void input_should_return_null_for_null_entry() {
        String stringAsInput = "";
        inputStream = new ByteArrayInputStream(stringAsInput.getBytes());
        input = new TerminalInput(inputStream);
        assertThat(input.getInput()).isEqualTo(null);
    }

    @Test
    void input_should_return_string_for_null_entry() {
        String stringAsInput = "";
        inputStream = new ByteArrayInputStream(stringAsInput.getBytes());
        input = new TerminalInput(inputStream);
        assertThat(input.getInput()).isEqualTo(null);
    }

}
