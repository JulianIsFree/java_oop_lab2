package sources.operation.types;

import sources.calculator.StackCalculator;
import sources.exceptions.calculator.NotEnoughOperandsException;
import sources.exceptions.calculator.ZeroDivisionException;

public class Division implements Operation {
    @Override
    public void run(StackCalculator stackCalculator) throws NotEnoughOperandsException, ZeroDivisionException{
        if (stackCalculator.size() < 2)
            throw new NotEnoughOperandsException(this, 2, stackCalculator.size());

        float first = stackCalculator.pop();
        float second = stackCalculator.pop();

        if (first == 0)
            throw new ZeroDivisionException(this);

        stackCalculator.push(second / first);
    }

    @Override
    public String getInfo() {
        return Division.class.toString();
    }
}
