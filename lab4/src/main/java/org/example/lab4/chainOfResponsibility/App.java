package org.example.lab4.chainOfResponsibility;

import java.util.Scanner;
import org.example.lab4.chainOfResponsibility.handlers.Handler;
import org.example.lab4.chainOfResponsibility.handlers.HighHandler;
import org.example.lab4.chainOfResponsibility.handlers.LowHandler;
import org.example.lab4.chainOfResponsibility.handlers.LowestHandler;
import org.example.lab4.chainOfResponsibility.handlers.MediumHandler;

public class App {
    public static void main(String[] args) {
        Handler highHandler = new HighHandler();
        Handler mediumHandler = new MediumHandler();
        Handler lowHandler = new LowHandler();
        Handler lowestHandler = new LowestHandler();

        highHandler.setNextHandler(mediumHandler);
        mediumHandler.setNextHandler(lowHandler);
        lowHandler.setNextHandler(lowestHandler);

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the priority of support you need (1-4):");
            int priority = scanner.nextInt();
            highHandler.handleRequest(priority);
        }
    }
}
