package org.example.lab4.observer;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class LightElementNode extends LightNode {
    private final String tagName;
    private final String displayType;
    private final boolean selfClosing;
    private final List<String> classes;
    private final List<LightNode> children;

    public LightElementNode(String tagName, String displayType, boolean isSelfClosing) {
        this.tagName = tagName;
        this.displayType = displayType;
        this.selfClosing = isSelfClosing;
        this.classes = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    @Override
    public String getOuterHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tagName);
        if (!classes.isEmpty()) {
            sb.append(" class='").append(String.join(" ", classes)).append("'");
        }
        sb.append(selfClosing ? "/>" : ">" + getInnerHTML() + "</").append(tagName).append(">");
        return sb.toString();
    }

    @Override
    public String getInnerHTML() {
        StringBuilder sb = new StringBuilder();
        for (LightNode child : children) {
            sb.append(child.getOuterHTML());
        }
        return sb.toString();
    }

    public void addChild(LightNode child) {
        children.add(child);
    }

    public void addClass(String classs) {
        this.classes.add(classs);
    }
}
