package sources.operation.types;

import sources.calculator.StackCalculator;
import sources.exceptions.calculator.NotEnoughOperandsException;

public class SquareRoot implements Operation{
    @Override
    public void run(StackCalculator stackCalculator) throws NotEnoughOperandsException {
        if (stackCalculator.size() < 1)
            throw new NotEnoughOperandsException(this, 1, stackCalculator.size());

        float value = stackCalculator.pop();
        stackCalculator.push((float)Math.sqrt(value));
    }

    @Override
    public String getInfo() {
        return SquareRoot.class.toString();
    }
}
