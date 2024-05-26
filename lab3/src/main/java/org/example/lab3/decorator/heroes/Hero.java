package org.example.lab3.decorator.heroes;

import org.example.lab3.decorator.Inventory;

public abstract class Hero {
    private String name;
    private Inventory inventory;

    protected Hero(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public abstract void attack();
}
