package sources.operation.types;

import sources.calculator.StackCalculator;
import sources.exceptions.calculator.NotEnoughOperandsException;
import sources.exceptions.calculator.PrintIOException;

import java.io.IOException;
import java.io.OutputStream;

public class Print implements Operation {
    private OutputStream outputStream;

    public Print(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run(StackCalculator stackCalculator) throws NotEnoughOperandsException, PrintIOException {
        if (stackCalculator.size() < 1)
            throw new NotEnoughOperandsException(this, 1, stackCalculator.size());

        float value = stackCalculator.pop();

        try {
            outputStream.write(Float.valueOf(value).byteValue());
        } catch (IOException e) {
            throw new PrintIOException(this, e);
        }

        stackCalculator.push(value);
    }

    @Override
    public String getInfo() {
        return Print.class + " " + outputStream.getClass();
    }
}
