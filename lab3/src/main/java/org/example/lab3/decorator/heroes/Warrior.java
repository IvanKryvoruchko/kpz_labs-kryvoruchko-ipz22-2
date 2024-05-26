package org.example.lab3.decorator.heroes;

public class Warrior extends Hero {
    
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " warrior attacks!");
    }
}
