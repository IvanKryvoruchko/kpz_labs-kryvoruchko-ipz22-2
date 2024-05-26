package org.example.lab3.lightweight;

public class LightTextNodeV2 extends LightNodeV2 {
    private final String text;

    public LightTextNodeV2(String text) {
        this.text = text;
    }

    @Override
    public String getOuterHTML() {
        return text;
    }
}
