package org.example.lab2.prototype;

import java.util.ArrayList;
import java.util.List;

public class Virus implements Cloneable {
    public int weight;
    public int age;
    public String name;

    public List<Virus> childList = new ArrayList<>();

    @Override
    public Virus clone() {
        Virus virusClone = new Virus();
        virusClone.weight = weight;
        virusClone.age = age;
        virusClone.name = name;
        for (Virus child : childList) {
            virusClone.childList.add(child.clone());
        }
        return virusClone;
    }

    public void printVirusInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);

        for (Virus child : childList) {
            child.printVirusInfo();
        }
    }
}
