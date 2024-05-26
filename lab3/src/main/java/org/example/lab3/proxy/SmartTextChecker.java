package org.example.lab3.proxy;

import java.io.IOException;

public class SmartTextChecker extends SmartTextReader {

    @Override
    public char[][] readFile(String path) throws IOException {
        System.out.println("Opening file: " + path);
        char[][] content = super.readFile(path);
        System.out.println("File successfully read");

        int lineCount = content.length;
        int charCount = 0;
        for (char[] line : content) {
            charCount += line.length;
        }

        System.out.println("Line count: " + lineCount + ", Characters count: " + charCount);
        System.out.println("Closing file: " + path);
        return content;
    }
}
