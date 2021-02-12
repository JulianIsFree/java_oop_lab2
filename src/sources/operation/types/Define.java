package sources.operation.types;

import sources.calculator.StackCalculator;
import sources.exceptions.calculator.VariableAlreadyDefinedException;

public class Define implements Operation {
    public final String variableName;
    public final float value;

    public Define(String variableName, float value) {
        this.variableName = variableName;
        this.value = value;
    }

    @Override
    public void run(StackCalculator stackCalculator) throws VariableAlreadyDefinedException{
        if(stackCalculator.isVariableDefined(variableName))
            throw new VariableAlreadyDefinedException(this, variableName);

        stackCalculator.defineVariable(variableName, value);
    }

    @Override
    public String getInfo() {
        return Define.class + " " + variableName + " " + value;
    }
}
