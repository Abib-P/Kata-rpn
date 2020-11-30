package io.pabib.rpn.test.operation;

import io.pabib.rpn.operation.Addition;
import io.pabib.rpn.operation.Operation;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Stack;

public class TestAddition {

    Operation addition = new Addition();

    @Mock
    Stack<Double> dummyStack ;

    @Mock
    Stack<Double> stackOfOneNumber;

    @Mock
    Stack<Double> stackOfMultipleNumber;

    @Test
    void calculate_should_return_optional_empty_when_given_empty_stack() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            assertThat(addition.calculate(dummyStack));
        });

        String expectedMessage = "Not enough values in stack";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void calculate_should_return_optional_empty_when_given_stack_of_one_number() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            stackOfOneNumber = new Stack<>();
            stackOfOneNumber.push(4.);
            assertThat(addition.calculate(stackOfOneNumber));
        });

        String expectedMessage = "Not enough values in stack";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void calculate_should_return_the_addition_of_two_last_when_given_stack_of_multiple_number(){
        stackOfMultipleNumber = new Stack<>();
        stackOfMultipleNumber.push(4.);
        stackOfMultipleNumber.push(6.);
        stackOfMultipleNumber.push(-44.);
        stackOfMultipleNumber.push(7.64);
        stackOfMultipleNumber.push(-4.32);
        assertThat(addition.calculate(stackOfMultipleNumber)).isCloseTo(3.32,within(0.01));
    }

}
