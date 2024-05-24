package org.example.lab2.builder;

import lombok.Data;

@Data
public class Character {
    public String Name;
    public int height;
    public int weight;
    public String hairColor;
    public String skinColor;
    public String gender;

    public void printInfo() {
        System.out.println("Name: " + Name);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Hair Color: " + hairColor);
        System.out.println("Skin Color: " + skinColor);
        System.out.println("Gender: " + gender);
    }
}
