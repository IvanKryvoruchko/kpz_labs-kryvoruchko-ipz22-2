package org.example.lab4.observer;

public class LightTextNode extends LightNode {
    private final String text;

    public LightTextNode(String text) {
        this.text = text;
    }

    @Override
    public String getOuterHTML() {
        return text;
    }

    @Override
    public String getInnerHTML() {
        return text;
    }
}
