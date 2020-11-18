package io.pabib.rpn.operation;

import java.util.Optional;
import java.util.Stack;

public class Addition implements Operation{
    @Override
    public Optional<Double> calculate(Stack<Double> stack) {
        if(stack == null)
            return Optional.empty();
        if(stack.size() < 2)
            return Optional.empty();
        return Optional.of(stack.pop() + stack.pop());
    }
}
