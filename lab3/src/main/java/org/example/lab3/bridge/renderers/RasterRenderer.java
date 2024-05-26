package org.example.lab3.bridge.renderers;

public class RasterRenderer implements Renderer {

    @Override
    public void render(String message) {
        System.out.println("Drawing " + message + " as pixels");
    }
}
