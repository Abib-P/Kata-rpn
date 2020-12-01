package io.pabib.rpn.application;

import io.pabib.rpn.calculator.Calculator;
import io.pabib.rpn.input.Input;
import io.pabib.rpn.input.terminal.TerminalInput;
import io.pabib.rpn.output.Output;
import io.pabib.rpn.output.terminal.TerminalOutput;

public class Application {
    public static void main(String[] args) {
        final Input input = new TerminalInput();
        final Output output = new TerminalOutput();
        final Calculator calculator = new Calculator();

        String actualInput = input.getInput();

        while(actualInput != null) {
            output.printResult(calculator.compute(actualInput));
            actualInput = input.getInput();
        }
    }
}
