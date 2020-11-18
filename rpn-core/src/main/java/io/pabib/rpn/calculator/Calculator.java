package io.pabib.rpn.calculator;

import java.util.Optional;
import java.util.Stack;

public class Calculator {

    Stack<Double> doubleStack;

    public Optional<Double> compute(String input) {

        if(input == null || input.equals(""))
        {
            return Optional.empty();
        }

        return Optional.of(Double.parseDouble(input));
    }
}
