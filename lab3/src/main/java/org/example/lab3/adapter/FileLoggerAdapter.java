package org.example.lab3.adapter;

public class FileLoggerAdapter extends Logger {
    private final FileWriter writer;

    public FileLoggerAdapter(String path) {
        this.writer = new FileWriter(path);
    }

    @Override
    public void log(String message) {
        writer.writeLine(message);
    }

    @Override
    public void error(String message) {
        writer.writeLine("ERROR: " + message);
    }

    @Override
    public void warn(String message) {
        writer.writeLine("WARNING: " + message);
    }
}
