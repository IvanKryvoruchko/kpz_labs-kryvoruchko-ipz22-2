package org.example.lab2.builder;

public class App {
    public static void main(String[] args) {
        Hero hero = new HeroBuilder()
            .setName("John")
            .setGender("Male")
            .setSkinColor("White")
            .setHairColor("Black")
            .setHeight(191)
            .addGoodTrait("Honesty")
            .addGoodTrait("Loyalty")
            .addGoodTrait("Kindness")
            .setWeight(100)
            .build();

        Enemy enemy = new EnemyBuilder()
            .setName("Viktor")
            .setGender("Male")
            .setSkinColor("Black")
            .setHairColor("Black")
            .setHeight(200)
            .setWeight(88)
            .addBadTrait("Egoism")
            .addBadTrait("Cruelty")
            .build();

        hero.printInfo();
        System.out.println();

        enemy.printInfo();
        System.out.println();
    }
}
