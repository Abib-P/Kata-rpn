package io.pabib.rpn.application;

import io.pabib.rpn.calculator.Calculator;
import io.pabib.rpn.input.Input;
import io.pabib.rpn.input.terminal.TerminalInput;
import io.pabib.rpn.output.Output;
import io.pabib.rpn.output.terminal.TerminalOutput;

public class Application {

    private final Input input;
    private final Output output;
    private final Calculator calculator;

    public Application(Input input, Output output, Calculator calculator) {
        this.input = input;
        this.output = output;
        this.calculator = calculator;
    }

    public void run() {
        output.printResult(calculator.compute(input.getInput()));
    }

    public static void main(String[] args) {
        Application application = new Application(new TerminalInput(),new TerminalOutput(), new Calculator());
        application.run();
    }
}
