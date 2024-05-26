package org.example.lab3.composite;

import org.example.lab3.composite.nodes.LightElementNode;
import org.example.lab3.composite.nodes.LightTextNode;

public class Program {
    public static void main(String[] args) {
        LightElementNode img = new LightElementNode("img", "inline", true);
        img.addClass("image-class");

        LightElementNode p = new LightElementNode("p", "block", false);
        p.addChild(new LightTextNode("text in tag <p>"));

        LightElementNode div = new LightElementNode("div", "block", false);
        div.addClass("container");
        div.addChild(p);
        div.addChild(img);

        System.out.println(div.getOuterHTML());
        System.out.println(div.getInnerHTML());
    }
}
