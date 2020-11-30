package io.pabib.rpn.operation;

import java.util.Stack;

public class Addition implements Operation{
    @Override
    public Double calculate(Stack<Double> stack) {
        if(stack == null)
            throw new RuntimeException("Not enough values in stack for an addition");
        if(stack.size() < 2){
            throw new RuntimeException("Not enough values in stack for an addition");
        }
        return stack.pop() + stack.pop();
    }
}
