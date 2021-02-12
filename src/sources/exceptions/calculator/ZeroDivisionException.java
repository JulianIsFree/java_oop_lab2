package sources.exceptions.calculator;

import sources.operation.types.Operation;

public class ZeroDivisionException extends OperationExecutionException {
    public ZeroDivisionException(Operation brokenOperation) {
        super(brokenOperation, "division by zero");
    }
}
