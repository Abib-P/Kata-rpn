package io.pabib.rpn.test.calculator;

import io.pabib.rpn.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class TestCalculator {

    Calculator calculator;

    @BeforeEach
    public void init(){
        calculator = new Calculator();
    }

    @Test
    void calculator_should_return_empty_for_empty_string() {
        // Given
        String input1 = null;
        String input2 = "";
        // Then
        assertThat(calculator.compute(input1)).isEmpty();
        assertThat(calculator.compute(input2)).isEmpty();
    }

    @ParameterizedTest
    @ValueSource(strings = {"1","4","6","-3","-42"})
    void calculator_should_return_number_for_1_number_in_string(String string) {
        assertThat(calculator.compute(string)).get().isEqualTo(Double.parseDouble(string));
    }
}
