package sources.operation.types;

import sources.calculator.StackCalculator;

public class Pop implements Operation {
    @Override
    public void run(StackCalculator stackCalculator) {
        stackCalculator.pop();
    }

    @Override
    public String getInfo() {
        return Pop.class.toString();
    }
}
