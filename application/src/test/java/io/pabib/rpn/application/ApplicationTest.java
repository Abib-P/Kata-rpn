package io.pabib.rpn.application;

import io.pabib.rpn.calculator.Calculator;
import io.pabib.rpn.input.Input;
import io.pabib.rpn.output.Output;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ApplicationTest {

    @Mock
    private Input input;

    @Mock
    private Output output;

    @Mock
    private Calculator calculator;

    private Application application;

    @BeforeEach
    void setup(){
        application = new Application(input,output,calculator);
    }

    @Test
    void should_print_output_given_input() {
        given(input.getInput()).willReturn("1 2 3");
        given(calculator.compute("1 2 3")).willReturn(Optional.of(5.));

        application.run();

        verify(output).printResult(Optional.of(5.));
    }
}
