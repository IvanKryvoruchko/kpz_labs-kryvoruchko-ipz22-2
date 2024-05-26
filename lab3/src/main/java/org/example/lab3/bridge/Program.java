package org.example.lab3.bridge;


import org.example.lab3.bridge.renderers.RasterRenderer;
import org.example.lab3.bridge.renderers.Renderer;
import org.example.lab3.bridge.renderers.VectorRenderer;
import org.example.lab3.bridge.shapes.Circle;
import org.example.lab3.bridge.shapes.Square;
import org.example.lab3.bridge.shapes.Triangle;

public class Program {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        Renderer rasterRenderer = new RasterRenderer();
        Renderer vectorRenderer = new VectorRenderer();

        // Vector rendering
        circle.draw(vectorRenderer);
        square.draw(vectorRenderer);
        triangle.draw(vectorRenderer);

        // Raster rendering
        circle.draw(rasterRenderer);
        square.draw(rasterRenderer);
        triangle.draw(rasterRenderer);
    }
}
