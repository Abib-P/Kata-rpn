package io.pabib.rpn.operation;

import java.util.Stack;

public class Multiplication implements Operation{
    @Override
    public Double calculate(Stack<Double> stack) {
        if(stack == null)
            throw new RuntimeException("Not enough values in stack for a multiplication");
        if(stack.size() < 2)
            throw new RuntimeException("Not enough values in stack for a multiplication");
        return stack.pop() * stack.pop();
    }
}
