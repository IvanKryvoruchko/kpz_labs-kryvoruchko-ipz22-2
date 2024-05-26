package org.example.lab3.decorator.items;

public class Artifact extends Item {
    
    @Override
    public void use() {
        System.out.println("Equipping artifact");
    }
}
