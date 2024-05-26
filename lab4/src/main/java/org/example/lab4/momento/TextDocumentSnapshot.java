package org.example.lab4.momento;

public record TextDocumentSnapshot(String text, TextEditor textEditor) {
    public void restore() {
        textEditor.setText(this.text);
    }
}
