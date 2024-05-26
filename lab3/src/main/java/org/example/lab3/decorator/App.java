package org.example.lab3.decorator;

import org.example.lab3.decorator.heroes.Mage;
import org.example.lab3.decorator.heroes.Paladin;
import org.example.lab3.decorator.heroes.Warrior;
import org.example.lab3.decorator.items.Armor;
import org.example.lab3.decorator.items.Item;
import org.example.lab3.decorator.items.Sword;
import org.example.lab3.decorator.items.Artifact;

public class App {

    public static void main(String[] args) {
        Warrior warrior = new Warrior("Warrior1");
        warrior.getInventory().addItem(new Armor());
        warrior.getInventory().addItem(new Sword());

        for (Item item : warrior.getInventory().getItems()) {
            item.use();
        }

        warrior.attack();

        Mage mage = new Mage("Mage1");
        mage.getInventory().addItem(new Artifact());

        mage.attack();

        Paladin paladin = new Paladin("Paladin1");
        paladin.attack();
    }
}
