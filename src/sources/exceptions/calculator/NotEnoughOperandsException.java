package sources.exceptions.calculator;

import sources.operation.types.Operation;

public class NotEnoughOperandsException extends OperationExecutionException {
    public NotEnoughOperandsException(Operation brokenOperation, int expectedNumber, int actualNumber) {
        super(brokenOperation, " not enough operands, expected " + expectedNumber + ", but found " + actualNumber);
    }
}
