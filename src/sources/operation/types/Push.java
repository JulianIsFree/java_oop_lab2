package sources.operation.types;

import sources.calculator.StackCalculator;
import sources.exceptions.calculator.OperationExecutionException;

public abstract class Push implements Operation {
    @Override
    public abstract void run(StackCalculator stackCalculator) throws OperationExecutionException;

    @Override
    public abstract String getInfo();
}
