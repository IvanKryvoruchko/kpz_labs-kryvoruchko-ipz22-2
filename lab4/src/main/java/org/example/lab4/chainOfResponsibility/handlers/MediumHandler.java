package org.example.lab4.chainOfResponsibility.handlers;

public class MediumHandler extends Handler {
    @Override
    public void handleRequest(int priority) {
        if (priority == 2)
            System.out.println("Priority Medium(2) Handler can handle this request.");
        else if (nextHandler != null)
            nextHandler.handleRequest(priority);
    }
}