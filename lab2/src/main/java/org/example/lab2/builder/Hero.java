package org.example.lab2.builder;

import java.util.ArrayList;
import java.util.List;

public class Hero extends Character {
    public List<String> goodTraits = new ArrayList<>();

    @Override
    public void printInfo() {
        System.out.println("================ Information about hero ================ ");
        super.printInfo();
        System.out.println("Good traits: " + String.join(",", goodTraits));
    }
}
