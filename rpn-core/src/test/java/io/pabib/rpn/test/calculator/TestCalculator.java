package io.pabib.rpn.test.calculator;

import io.pabib.rpn.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class TestCalculator {

    Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }

    @ParameterizedTest
    @NullAndEmptySource
    void calculator_should_return_empty_for_empty_string(String string) {
        assertThat(calculator.compute(string)).isEmpty();
    }

    @ParameterizedTest
    @ValueSource(strings = {"1","4","6","-3","-42"})
    void calculator_should_return_number_for_1_number_in_string(String string) {
        assertThat(calculator.compute(string)).get().isEqualTo(Double.parseDouble(string));
    }

    @ParameterizedTest
    @CsvSource(value = {"1 2 +:3", "4 4 5 - +:3", "6 7 + 9 -:4"}, delimiter = ':')
    void calculator_should_return_number_for_calculation_possible_in_string(String string,Double value) {
        assertThat(calculator.compute(string)).get().isEqualTo(value);
    }
}
