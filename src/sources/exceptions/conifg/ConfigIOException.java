package sources.exceptions.conifg;

import java.io.IOException;

public class ConfigIOException extends ConfigException {
    public ConfigIOException(String fileName, IOException e) {
        super("Error while reading file: " + fileName + ". Due to: " + e.toString());
    }
}
