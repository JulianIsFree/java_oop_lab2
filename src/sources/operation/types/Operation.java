package sources.operation.types;

import sources.calculator.StackCalculator;
import sources.exceptions.calculator.OperationExecutionException;

public interface Operation {
    // Performs an operation on the calculator calculator
    void run(StackCalculator stackCalculator) throws OperationExecutionException;

    // Returns String descriptor of operation
    // for Exceptions handling
    String getInfo();
}
