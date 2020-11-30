package io.pabib.rpn.operation;

import java.util.Stack;

public class Substraction implements Operation{
    @Override
    public Double calculate(Stack<Double> stack){
        if(stack == null)
            throw new RuntimeException("Not enough values in stack for a substraction");
        if(stack.size() < 2)
            throw new RuntimeException("Not enough values in stack for a substraction");
        Double second = stack.pop();
        Double first = stack.pop();
        return first - second;
    }
}
