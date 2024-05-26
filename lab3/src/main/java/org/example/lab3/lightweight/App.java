package org.example.lab3.lightweight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.example.lab3.composite.nodes.LightElementNode;
import org.example.lab3.composite.nodes.LightTextNode;

public class App {
    public static void main(String[] args) throws IOException {
        List<String> bookLines = Files.readAllLines(Paths.get("src/main/java/org/example/lab3/lightweight/pg1513.txt"));

        //v1
        LightElementNode root = new LightElementNode("div", "block", false);
        for (int i = 0; i < bookLines.size(); i++) {
            String line = bookLines.get(i);
            LightElementNode elementNode;
            if (i == 0) {
                elementNode = new LightElementNode("h1", "inline", false);
            } else if (line.length() < 20) {
                elementNode = new LightElementNode("h2", "inline", false);
            } else if (line.startsWith(" ")) {
                elementNode = new LightElementNode("blockquote", "block", false);
            } else {
                elementNode = new LightElementNode("p", "block", false);
            }
            elementNode.addChild(new LightTextNode(line));
            root.addChild(elementNode);
        }
        System.out.println(root.getOuterHTML());

        // v2 method
//        LightElementNodeV2 root = new LightElementNodeV2("div");
//        for (int i = 0; i < bookLines.size(); i++) {
//            String line = bookLines.get(i);
//            LightElementNodeV2 elementNode;
//            if (i == 0) {
//                elementNode = LightElementNodeV2.getLightWeight("h1");
//            } else if (line.length() < 20) {
//                elementNode = LightElementNodeV2.getLightWeight("h2");
//            } else if (line.startsWith(" ")) {
//                elementNode = LightElementNodeV2.getLightWeight("blockquote");
//            } else {
//                elementNode = LightElementNodeV2.getLightWeight("p");
//            }
//            elementNode.addChild(new LightTextNodeV2(line));
//            root.addChild(elementNode);
//        }
//         System.out.println(root.getOuterHTML());

        // Show memory usage
        long memoryUsed = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory usage: " + memoryUsed + " bytes");
    }
}
