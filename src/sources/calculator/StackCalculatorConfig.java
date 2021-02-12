package sources.calculator;

import sources.exceptions.conifg.BadContentException;
import sources.exceptions.conifg.ConfigIOException;
import sources.exceptions.conifg.MultipleDefinitionException;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class StackCalculatorConfig {
    private HashMap<String, String> map;
    private final String fileName;

    public StackCalculatorConfig(String fileName) {
        this.fileName = fileName;
    }

    public void read() throws BadContentException, MultipleDefinitionException, ConfigIOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            HashMap<String, String> newMap = new HashMap<String, String>();
            int row = 0;

            while (bufferedReader.ready()) {
                String lineContent = bufferedReader.readLine();
                String[] line = lineContent.split(" ");

                if (line.length != 2)
                    throw new BadContentException(row, lineContent);

                String operationName = line[0];
                String operationClass = line[1];

                if (newMap.containsKey(operationName))
                    throw new MultipleDefinitionException(row, lineContent, operationName);

                newMap.put(operationName, operationClass);

                row++;
            }

            bufferedReader.close();
            map = newMap;
        } catch (IOException e) {
            throw new ConfigIOException(fileName, e);
        }
    }

    public String getClassName(String operationName) {
        return map.get(operationName);
    }
}
