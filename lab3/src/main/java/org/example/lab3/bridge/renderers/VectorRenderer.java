package org.example.lab3.bridge.renderers;

public class VectorRenderer implements Renderer {
    @Override
    public void render(String message) {
        System.out.println("Drawing " + message + " as vectors");
    }
}
