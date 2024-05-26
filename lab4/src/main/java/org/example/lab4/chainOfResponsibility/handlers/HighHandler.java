package org.example.lab4.chainOfResponsibility.handlers;

public class HighHandler extends Handler {
    @Override
    public void handleRequest(int priority) {
        if (priority == 1)
            System.out.println("Priority High(1) Handler can handle this request.");
        else if (nextHandler != null)
            nextHandler.handleRequest(priority);
    }
}





