package org.example.lab4.strategy;

import org.example.lab4.strategy.loaders.Load;

public class Image {
    private final String path;
    private final Load loader;

    public Image(String path, Load loader) {
        this.path = path;
        this.loader = loader;
    }

    public void loadImage() {
        loader.loadImage(path);
    }
}
