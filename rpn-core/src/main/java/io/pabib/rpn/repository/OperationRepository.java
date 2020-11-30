package io.pabib.rpn.repository;

import io.pabib.rpn.operation.*;

import java.util.Stack;

public class OperationRepository {
    Operation operation;

    Stack<Double> doubleStack;

    public OperationRepository(){
        doubleStack = new Stack<>();
    }

    public void push(double newDouble) {
        doubleStack.push(newDouble);
    }

    public void apply(String token) {
        changeOperation(token);
    }

    private void changeOperation(String token){
        switch (token) {
            case "+":
                if (!(operation instanceof Addition))
                    operation = new Addition();
                doubleStack.add(operation.calculate(doubleStack));
                break;
            case "-":
                if (!(operation instanceof Substraction))
                    operation = new Substraction();
                doubleStack.add(operation.calculate(doubleStack));
                break;
            case "*":
                if (!(operation instanceof Multiplication))
                    operation = new Multiplication();
                doubleStack.add(operation.calculate(doubleStack));
                break;
            case "/":
                if (!(operation instanceof Division))
                    operation = new Division();
                doubleStack.add(operation.calculate(doubleStack));
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    public Double getFinalValue(){
        if(doubleStack.size() != 1)
            throw new RuntimeException("Result not valid");
        return doubleStack.pop();
    }
}
