package org.example.lab3.proxy;

import lombok.SneakyThrows;

public class Program {

    @SneakyThrows
    public static void main(String[] args) {
        SmartTextChecker smartTextChecker = new SmartTextChecker();
        smartTextChecker.readFile("test.txt");

        SmartTextReader smartTextReader = new SmartTextReader();
        smartTextReader.readFile("test.txt");

        SmartTextReaderLocker smartTextReaderLocker = new SmartTextReaderLocker("\\.txt$");
        smartTextReaderLocker.readFile("test.txt");
    }
}
