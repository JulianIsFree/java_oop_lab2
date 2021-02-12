package sources.operation.types;

import sources.calculator.StackCalculator;
import sources.exceptions.calculator.VariableNotDefinedException;

public class PushLocale extends Push {

    public final String variableName;
    public PushLocale(String varName) {
        this.variableName = varName;
    }

    @Override
    public void run(StackCalculator stackCalculator) throws VariableNotDefinedException {
        if(!stackCalculator.isVariableDefined(variableName))
            throw new VariableNotDefinedException(this, variableName);

        stackCalculator.push(stackCalculator.getVariable(variableName));
    }

    @Override
    public String getInfo() {
        return PushLocale.class + " " + variableName;
    }
}
