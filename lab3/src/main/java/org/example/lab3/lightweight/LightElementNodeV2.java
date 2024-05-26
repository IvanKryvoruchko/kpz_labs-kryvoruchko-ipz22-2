package org.example.lab3.lightweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LightElementNodeV2 extends LightNodeV2 {
    private static final Map<String, LightElementNodeV2> lightWeight = new HashMap<>();
    private final String tagName;
    private final List<LightNodeV2> children;

    public static LightElementNodeV2 getLightWeight(String tagName) {
        if (!lightWeight.containsKey(tagName)) {
            lightWeight.put(tagName, new LightElementNodeV2(tagName));
        }
        return lightWeight.get(tagName);
    }

    public LightElementNodeV2(String tagName) {
        this.tagName = tagName;
        this.children = new ArrayList<>();
    }

    public void addChild(LightNodeV2 child) {
        children.add(child);
    }

    @Override
    public String getOuterHTML() {
        StringBuilder childrenHTML = new StringBuilder();
        for (LightNodeV2 child : children) {
            childrenHTML.append(child.getOuterHTML());
        }
        return "<" + tagName + ">" + childrenHTML + "</" + tagName + ">";
    }
}
