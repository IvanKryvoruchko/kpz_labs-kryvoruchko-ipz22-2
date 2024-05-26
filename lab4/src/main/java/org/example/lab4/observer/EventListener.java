package org.example.lab4.observer;

import java.util.function.Consumer;

public class EventListener {
    private final Consumer<String> callback;

    public EventListener(Consumer<String> callback) {
        this.callback = callback;
    }

    public Consumer<String> getEventCallback() {
        return callback;
    }
}
