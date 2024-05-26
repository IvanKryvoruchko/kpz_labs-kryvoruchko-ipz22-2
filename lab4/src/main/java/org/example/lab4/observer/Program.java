package org.example.lab4.observer;

public class Program {
    public static void main(String[] args) {
        LightElementNode button = new LightElementNode("button", "inline", false);
        button.addChild(new LightTextNode("Click!"));

        button.addEventListener("click", new EventListener(metadata -> {
            System.out.println("Button clicked! Metadata: " + metadata);
        }));

        System.out.println(button.getOuterHTML());
        button.triggerEvent("click", "Button clicked!");
    }
}
