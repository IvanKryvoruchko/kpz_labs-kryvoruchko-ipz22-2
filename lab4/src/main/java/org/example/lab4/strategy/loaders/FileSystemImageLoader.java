package org.example.lab4.strategy.loaders;

public class FileSystemImageLoader implements Load {
    @Override
    public void loadImage(String path) {
        System.out.println("Loading image from file system, path: " + path);
    }
}
