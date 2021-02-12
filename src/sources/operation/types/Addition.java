package sources.operation.types;

import sources.calculator.StackCalculator;
import sources.exceptions.calculator.NotEnoughOperandsException;

public class Addition implements Operation{
    @Override
    public void run(StackCalculator stackCalculator) throws NotEnoughOperandsException {
        if (stackCalculator.size() < 2)
            throw new NotEnoughOperandsException(this, 2, stackCalculator.size());

        float first = stackCalculator.pop();
        float second = stackCalculator.pop();
        stackCalculator.push(first + second);
    }

    @Override
    public String getInfo() {
        return Addition.class.toString();
    }
}
