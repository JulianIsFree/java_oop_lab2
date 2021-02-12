package sources.operation.factory;

public enum Kind {
    DEFINE("DEFINE"),
    PUSH("PUSH"),
    POP("POP"),
    PRINT("PRINT"),

    SQRT("SQRT"),
    ADD("+"),
    SUB("-"),
    MUL("*"),
    DIV("/");

    Kind(String symbol) {
        this.symbol = symbol;
    }

    public final String symbol;
}
