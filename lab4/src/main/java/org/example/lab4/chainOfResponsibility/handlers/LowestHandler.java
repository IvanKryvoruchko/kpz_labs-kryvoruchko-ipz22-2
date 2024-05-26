package org.example.lab4.chainOfResponsibility.handlers;

public class LowestHandler extends Handler {
    @Override
    public void handleRequest(int priority) {
        if (priority == 3)
            System.out.println("Priority Lowest(4) Handler can handle this request.");
        else if (nextHandler != null)
            nextHandler.handleRequest(priority);
    }
}
