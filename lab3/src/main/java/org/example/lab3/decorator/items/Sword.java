package org.example.lab3.decorator.items;

public class Sword extends Item {
    
    @Override
    public void use() {
        System.out.println("Equipping sword");
    }
}
