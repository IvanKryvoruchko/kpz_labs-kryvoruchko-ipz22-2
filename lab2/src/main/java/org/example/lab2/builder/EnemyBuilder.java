package org.example.lab2.builder;

public class EnemyBuilder {
    private Enemy enemyCharacter = new Enemy();

    public void reset() {
        enemyCharacter = new Enemy();
    }

    public EnemyBuilder setName(String name) {
        enemyCharacter.setName(name);
        return this;
    }

    public EnemyBuilder setHeight(int height) {
        enemyCharacter.setHeight(height);
        return this;
    }

    public EnemyBuilder setWeight(int weight) {
        enemyCharacter.setWeight(weight);
        return this;
    }

    public EnemyBuilder setHairColor(String hairColor) {
        enemyCharacter.setHairColor(hairColor);
        return this;
    }

    public EnemyBuilder setSkinColor(String skinColor) {
        enemyCharacter.setSkinColor(skinColor);
        return this;
    }

    public EnemyBuilder setGender(String gender) {
        enemyCharacter.setGender(gender);
        return this;
    }

    public EnemyBuilder addBadTrait(String trait) {
        enemyCharacter.badTraits.add(trait);
        return this;
    }

    public Enemy build() {
        return enemyCharacter;
    }
}
