package sources.exceptions.conifg;

public class ConfigReadException extends ConfigException {
    public ConfigReadException(String message, int row, String content) {
        super("In row " + row + " problem: " + message + ". Row content: " + content);
    }
}
