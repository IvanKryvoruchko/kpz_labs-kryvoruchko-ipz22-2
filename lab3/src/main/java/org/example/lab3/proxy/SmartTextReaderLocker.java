package org.example.lab3.proxy;

import java.io.IOException;
import java.util.regex.Pattern;

public class SmartTextReaderLocker extends SmartTextReader {
    private final Pattern fileRestrictionPattern;

    public SmartTextReaderLocker(String pattern) {
        this.fileRestrictionPattern = Pattern.compile(pattern);
    }

    @Override
    public char[][] readFile(String path) throws IOException {
        if (fileRestrictionPattern.matcher(path).matches()) {
            System.out.println("Access denied!");
            return null;
        }
        return super.readFile(path);
    }
}
