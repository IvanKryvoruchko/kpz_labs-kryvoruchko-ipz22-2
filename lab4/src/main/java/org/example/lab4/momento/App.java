package org.example.lab4.momento;

public class App {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.setText("Hello, World!");
        TextDocumentSnapshot textDocumentSnapshot = editor.makeSnapshot();
        editor.setText("It's lab4!");
        System.out.println("Text before restore: " + editor.getText());
        textDocumentSnapshot.restore();
        System.out.println("Restored Text: " + editor.getText());
    }
}
