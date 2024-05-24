package org.example.lab2.builder;

public class HeroBuilder {
    private final Hero heroCharacter = new Hero();

    public HeroBuilder setName(String name) {
        heroCharacter.setName(name);
        return this;
    }

    public HeroBuilder setHeight(int height) {
        heroCharacter.setHeight(height);
        return this;
    }

    public HeroBuilder setWeight(int weight) {
        heroCharacter.setWeight(weight);
        return this;
    }

    public HeroBuilder setHairColor(String hairColor) {
        heroCharacter.setHairColor(hairColor);
        return this;
    }

    public HeroBuilder setSkinColor(String skinColor) {
        heroCharacter.setSkinColor(skinColor);
        return this;
    }

    public HeroBuilder setGender(String gender) {
        heroCharacter.setGender(gender);
        return this;
    }

    public HeroBuilder addGoodTrait(String trait) {
        heroCharacter.goodTraits.add(trait);
        return this;
    }

    public Hero build() {
        return heroCharacter;
    }
}
