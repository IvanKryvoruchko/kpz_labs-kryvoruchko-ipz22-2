package org.example.lab3.adapter;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import lombok.SneakyThrows;

public class FileWriter {
    private final String path;

    public FileWriter(String path) {
        this.path = path;
    }

    @SneakyThrows
    public void write(String message) {
        Files.write(Paths.get(path), message.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }

    @SneakyThrows
    public void writeLine(String message) {
        Files.write(Paths.get(path), (message + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }
}
