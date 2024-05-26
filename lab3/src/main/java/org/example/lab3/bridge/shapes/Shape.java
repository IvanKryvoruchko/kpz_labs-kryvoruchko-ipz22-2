package org.example.lab3.bridge.shapes;

import org.example.lab3.bridge.renderers.Renderer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Shape {
    private String name;

    public abstract void draw(Renderer renderer);
}
