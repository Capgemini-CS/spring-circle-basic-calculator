package org.calculator.exceptions;

public class DivisionByZeroException extends Exception {

    public DivisionByZeroException(String errorMessage) {
        super(errorMessage);
    }
}
