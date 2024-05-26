package org.example.lab3.decorator.heroes;

public class Paladin extends Hero {
    
    public Paladin(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " paladin attack!");
    }
}
