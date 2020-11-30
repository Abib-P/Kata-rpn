package io.pabib.rpn.output.terminal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.PrintStream;
import java.util.Optional;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class TerminalOutputTest {

    @Mock
    private PrintStream printStream;

    private TerminalOutput terminalOutput;

    @BeforeEach
    void setup(){
        terminalOutput = new TerminalOutput(printStream);
    }

    @Test
    void should_print_failure_given_a_null_value(){
        Optional<Double> value = null;

        terminalOutput.printResult(value);

        verify(printStream).println("invalid operation");
    }

    @Test
    void should_print_formatted_message_given_value(){
        Optional<Double> value = Optional.of(1.2);

        terminalOutput.printResult(value);

        verify(printStream).println("result is 1.2");
    }
}