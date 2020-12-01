package io.pabib.rpn.input.terminal;

import io.pabib.rpn.input.Input;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

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
    void input_should_return_string_for_string_entry() {
        String stringAsInput = "1 2 +";
        inputStream = new ByteArrayInputStream(stringAsInput.getBytes());
        input = new TerminalInput(inputStream);
        assertThat(input.getInput()).isEqualTo(stringAsInput);
    }
}
