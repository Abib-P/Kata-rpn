package io.pabib.rpn.test.operation;

import io.pabib.rpn.operation.Addition;
import io.pabib.rpn.operation.Operation;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(addition.calculate(dummyStack)).isEmpty();
    }

    @Test
    void calculate_should_return_optional_empty_when_given_stack_of_one_number() {
        stackOfOneNumber = new Stack<>();
        stackOfOneNumber.push(4.);
        assertThat(addition.calculate(stackOfOneNumber)).isEmpty();
    }

    @Test
    void calculate_should_return_the_addition_of_two_last_when_given_stack_of_multiple_number(){
        stackOfMultipleNumber = new Stack<>();
        stackOfMultipleNumber.push(4.);
        stackOfMultipleNumber.push(6.);
        stackOfMultipleNumber.push(-44.);
        stackOfMultipleNumber.push(7.64);
        stackOfMultipleNumber.push(-4.32);
        assertThat(addition.calculate(stackOfMultipleNumber)).get().isEqualTo(7.64+-4.32);
    }

}
