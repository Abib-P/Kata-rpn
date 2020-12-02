package io.pabib.rpn.input.terminal;

import io.pabib.rpn.input.Input;

import java.io.InputStream;
import java.util.Scanner;

public class TerminalInput implements Input {

    Scanner scanner;

    TerminalInput(InputStream inputStream){
        scanner = new Scanner(inputStream);
    }

    public TerminalInput(){
        scanner = new Scanner(System.in);
    }

    @Override
    public String getInput() {
        if (scanner.hasNext())
            return scanner.nextLine();
        return null;
    }
}
