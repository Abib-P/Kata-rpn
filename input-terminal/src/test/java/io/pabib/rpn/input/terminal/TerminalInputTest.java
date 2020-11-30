package io.pabib.rpn.input.terminal;

import io.pabib.rpn.input.Input;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.assertj.core.api.Assertions.assertThat;

public class TerminalInputTest {

    Input input = new TerminalInput();


    @BeforeEach
    public void init(){
        input = new TerminalInput();
    }

    @ParameterizedTest
    @NullAndEmptySource
    void calculator_should_return_empty_for_empty_string(String string) {
        assertThat(input);
    }
}
