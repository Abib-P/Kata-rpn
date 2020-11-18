package io.pabib.rpn.operation;

import java.util.Optional;
import java.util.Stack;

public interface Operation {
    Optional<Double> calculate(Stack<Double> stack);
}
