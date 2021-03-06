package io.pabib.rpn.output.terminal;

import io.pabib.rpn.output.Output;

import java.io.PrintStream;
import java.util.Optional;

public class TerminalOutput implements Output {

    private final PrintStream printStream;

    public TerminalOutput() {
        printStream = System.out;
    }

    public TerminalOutput(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void printResult(Optional<Double> value) {
        if (value == null || value.isEmpty())
            printStream.println("invalid operation");
        else
            printStream.println("result is " + value.get());
    }
}
