package sources.exceptions.calculator;

import sources.operation.types.Operation;

import java.io.IOException;

public class PrintIOException extends OperationExecutionException {
    public PrintIOException(Operation brokenOperation, IOException e) {
        super(brokenOperation, e.toString());
    }
}
