package io.pabib.rpn.calculator;

import java.util.Optional;
import java.util.Stack;

import static io.pabib.rpn.conversion.Conversion.isDouble;

public class Calculator {

    Stack<Double> doubleStack;

    public Optional<Double> compute(String input) {

        if(input == null || input.equals(""))
        {
            return Optional.empty();
        }
        if(isDouble(input))
        {
            return Optional.of(Double.parseDouble(input));
        }
        return Optional.of(Double.parseDouble(input));
    }
}
