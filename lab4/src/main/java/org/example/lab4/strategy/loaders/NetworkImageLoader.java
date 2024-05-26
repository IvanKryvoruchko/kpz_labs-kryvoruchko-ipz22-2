package org.example.lab4.strategy.loaders;

public class NetworkImageLoader implements Load {
    @Override
    public void loadImage(String path) {
        System.out.println("Loading image from network, path: " + path);
    }
}
