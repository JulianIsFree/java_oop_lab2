package sources.calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackCalculator extends Stack<Float> {
    private static String operationsFolder = "sources.operation.types.";
    private Map<String, Float> constantPool;

    public StackCalculator() {
        constantPool = new HashMap<String, Float>();
    }

    public Float getVariable(String varName) {
        return constantPool.get(varName);
    }

    public void defineVariable(String variableName, float value) {
        constantPool.put(variableName, value);
    }

    public boolean isVariableDefined(String name) {
        return constantPool.containsKey(name);
    }
}
