package org.example.lab3.bridge.shapes;


import org.example.lab3.bridge.renderers.Renderer;

public class Circle extends Shape {
    @Override
    public void draw(Renderer renderer) {
        renderer.render("Circle");
    }
}
