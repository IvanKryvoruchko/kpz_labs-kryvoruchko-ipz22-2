package org.example.lab2.builder;

import java.util.ArrayList;
import java.util.List;

public class Enemy extends Character {
    public List<String> badTraits = new ArrayList<>();

    @Override
    public void printInfo() {
        System.out.println("================ Information about enemy ================ ");
        super.printInfo();
        System.out.println("Bad traits: " + String.join(",", badTraits));
    }
}
