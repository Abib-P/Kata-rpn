package io.pabib.rpn.conversion;

public class Conversion {
    static public boolean isDouble(String value){
        try {
            Double.parseDouble(value);
        }
        catch (NumberFormatException e){
            return false;
        }

        return true;
    }
}
