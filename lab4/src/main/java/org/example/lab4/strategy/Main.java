package org.example.lab4.strategy;

import org.example.lab4.strategy.loaders.FileSystemImageLoader;
import org.example.lab4.strategy.loaders.NetworkImageLoader;

public class Main {
    public static void main(String[] args) {

        Image fileSystemImage = new Image("dir/test.jpg", new FileSystemImageLoader());
        fileSystemImage.loadImage();

        Image networkImage = new Image("https://test.com/image.jpg", new NetworkImageLoader());
        networkImage.loadImage();
    }
}
