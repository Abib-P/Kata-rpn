package io.pabib.rpn.operation;

import java.util.Optional;
import java.util.Stack;

public class Division implements Operation{
    @Override
    public Optional<Double> calculate(Stack<Double> stack) {
        if(stack == null)
            return Optional.empty();
        if(stack.size() < 2)
            return Optional.empty();
        Double second = stack.pop();
        Double first = stack.pop();
        return Optional.of(first / second);
    }
}
