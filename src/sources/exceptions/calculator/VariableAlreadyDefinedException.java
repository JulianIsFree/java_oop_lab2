package sources.exceptions.calculator;

import sources.operation.types.Operation;

public class VariableAlreadyDefinedException extends OperationExecutionException {
    public VariableAlreadyDefinedException(Operation brokenOperation, String variableName) {
        super(brokenOperation, "variable " + variableName + " is already defined");
    }
}
