package org.example.lab3.decorator.heroes;

public class Mage extends Hero {
    
    public Mage(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " mage attack!");
    }
}
