package org.example.lab3.adapter;

public class App {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("Usual message");
        logger.error("Error message");
        logger.warn("Warn message");

        FileLoggerAdapter fileLogger = new FileLoggerAdapter("log.txt");
        fileLogger.log("Usual message");
        fileLogger.error("Error message");
        fileLogger.warn("Warn message");
    }
}
