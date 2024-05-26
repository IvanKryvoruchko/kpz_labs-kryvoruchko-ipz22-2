package org.example.lab3.decorator.items;

public class Armor extends Item {
    
    @Override
    public void use() {
        System.out.println("Equipping armor");
    }
}
