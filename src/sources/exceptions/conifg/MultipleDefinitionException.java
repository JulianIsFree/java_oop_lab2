package sources.exceptions.conifg;

public class MultipleDefinitionException extends ConfigReadException {
    public MultipleDefinitionException(int row, String content, String operationName) {
        super("operation " + operationName + " is referenced to more than 1 operation class name" ,row, content);
    }
}
