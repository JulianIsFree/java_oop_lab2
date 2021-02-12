package sources.exceptions.calculator;

import sources.operation.types.Operation;

public class VariableNotDefinedException extends OperationExecutionException {
    public VariableNotDefinedException(Operation brokenOperation, String variableName) {
        super(brokenOperation, "variable " + variableName + " isn't defined");
    }
}
