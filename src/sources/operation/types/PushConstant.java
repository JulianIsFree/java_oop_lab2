package sources.operation.types;

import sources.calculator.StackCalculator;

public class PushConstant extends Push {

    public final float value;
    public PushConstant(float value) {
        this.value = value;
    }

    @Override
    public void run(StackCalculator stackCalculator) {
        stackCalculator.push(value);
    }

    @Override
    public String getInfo() {
        return PushConstant.class + " " + value;
    }
}
