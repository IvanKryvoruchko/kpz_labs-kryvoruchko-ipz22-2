package org.example.lab3.proxy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SmartTextReader {

    public char[][] readFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        StringBuilder contentBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            contentBuilder.append(line).append("\n");
        }
        reader.close();
        
        String[] lines = contentBuilder.toString().split("\n");
        char[][] content = new char[lines.length][];
        for (int i = 0; i < lines.length; i++) {
            content[i] = lines[i].toCharArray();
        }
        return content;
    }
}
