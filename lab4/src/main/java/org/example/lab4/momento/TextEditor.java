package org.example.lab4.momento;

public class TextEditor {
    private final TextDocument document;

    public TextEditor() {
        document = new TextDocument();
    }

    public void setText(String newText) {
        document.setText(newText);
    }

    public TextDocumentSnapshot makeSnapshot() {
        return new TextDocumentSnapshot( document.getText(), this);
    }

    public String getText() {
        return document.getText();
    }
}

