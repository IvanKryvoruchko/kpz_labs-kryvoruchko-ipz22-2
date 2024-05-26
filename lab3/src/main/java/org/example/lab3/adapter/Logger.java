package org.example.lab3.adapter;

import java.io.Console;
import lombok.Getter;

public class Logger {

    public void log(String message) {
        printMessage(message, ConsoleColor.GREEN);
    }

    public void error(String message) {
        printMessage(message, ConsoleColor.RED);
    }

    public void warn(String message) {
        printMessage(message, ConsoleColor.DARK_YELLOW);
    }

    private void printMessage(String message, ConsoleColor color) {
        Console console = System.console();
        if (console == null) {
            System.out.println(message);
        } else {
            console.printf("%s%s%s%n", color.getColorCode(), message, ConsoleColor.RESET.getColorCode());
        }
    }

    @Getter
    private enum ConsoleColor {
        GREEN("\u001B[32m"),
        RED("\u001B[31m"),
        DARK_YELLOW("\u001B[33m"),
        RESET("\u001B[0m");

        private final String colorCode;

        ConsoleColor(String colorCode) {
            this.colorCode = colorCode;
        }

    }
}
