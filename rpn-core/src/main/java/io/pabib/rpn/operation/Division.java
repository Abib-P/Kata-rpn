package io.pabib.rpn.operation;

import java.util.Stack;

public class Division implements Operation{
    @Override
    public Double calculate(Stack<Double> stack) {
        if(stack == null)
            throw new RuntimeException("Not enough values in stack for a division");
        if(stack.size() < 2)
            throw new RuntimeException("Not enough values in stack for a division");
        Double second = stack.pop();
        Double first = stack.pop();
        return first / second;
    }
}
