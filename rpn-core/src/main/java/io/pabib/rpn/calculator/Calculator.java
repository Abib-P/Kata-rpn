package io.pabib.rpn.calculator;

import io.pabib.rpn.repository.OperationRepository;
import java.util.*;

import static io.pabib.rpn.utile.Conversion.isDouble;

public class Calculator {

    OperationRepository operationRepository ;

    public Calculator(){
        operationRepository = new OperationRepository();
    }

    public Optional<Double> compute(String input) {

        if(input == null || input.equals(""))
        {
            return Optional.empty();
        }
        if(isDouble(input))
        {
            return Optional.of(Double.parseDouble(input));
        }
        Double finalValue;
        List<String> d = Arrays.asList(input.split(" "));
        d.forEach(s -> {
                    if (isDouble(s)) {
                        operationRepository.push(Double.parseDouble(s));
                    } else {
                        operationRepository.apply(s);
                    }
                });
        finalValue = operationRepository.getFinalValue();
        return Optional.of(finalValue);
    }
}
