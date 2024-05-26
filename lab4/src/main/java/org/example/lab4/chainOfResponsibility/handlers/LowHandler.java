package org.example.lab4.chainOfResponsibility.handlers;

public class LowHandler extends Handler {
    @Override
    public void handleRequest(int priority) {
        if (priority == 3)
            System.out.println("Priority Low(3) Handler can handle this request.");
        else if (nextHandler != null)
            nextHandler.handleRequest(priority);
    }
}