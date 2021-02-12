package sources.exceptions.conifg;

public class BadContentException extends ConfigReadException {
    public BadContentException(int row, String content) {
        super("bad content", row, content);
    }
}
