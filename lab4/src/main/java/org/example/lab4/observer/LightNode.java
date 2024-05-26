package org.example.lab4.observer;

import java.util.HashMap;
import java.util.Map;

public abstract class LightNode {
    private final Map<String, EventListener> eventListeners = new HashMap<>();

    public abstract String getOuterHTML();
    public abstract String getInnerHTML();

    public void addEventListener(String eventName, EventListener listener) {
        eventListeners.put(eventName, listener);
    }

    public void triggerEvent(String eventName, String eventData) {
        EventListener eventListener = eventListeners.get(eventName);
        if (eventListener != null) {
            eventListener.getEventCallback().accept(eventData);
        }
    }
}
