package sources.exceptions.calculator;

import sources.operation.types.Operation;

public abstract class OperationExecutionException extends Throwable{
    public final Operation brokenOperation;

    public OperationExecutionException(Operation brokenOperation, String message) {
        super("Operation: [" + brokenOperation.getInfo() + "]" + " failed to perform due to reason: " + message);
        this.brokenOperation = brokenOperation;
    }
}
