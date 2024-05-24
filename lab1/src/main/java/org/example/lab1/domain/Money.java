package org.example.lab1.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public class Money {
    private int mainPart = 0;
    private int coins = 0;

    public Money(int mainPart, int coins) {
        setMainPart(mainPart);
        setCoins(coins);
    }

    public Money(int totalCoins) {
        setMainPart(totalCoins / 100);
        setCoins(totalCoins % 100);
    }

    public void setMainPart(int mainPart) {
        if (mainPart < 0) {
            throw new IllegalArgumentException("Main part value should be larger than 0.");
        }
        this.mainPart = mainPart;
    }

    public void setCoins(int coins) {
        if (coins < 0 || coins >= 100) {
            throw new IllegalArgumentException("Cents value should be between 0 and 99.");
        }
        this.coins = coins;
    }

    @Override
    public String toString() {
        return mainPart + "." + coins;
    }

    public int getTotalInCoins() {
        return 100 * mainPart + coins;
    }

    public boolean isLessThan(Money money) {
        return getTotalInCoins() < money.getTotalInCoins();
    }

    public Money subtract(Money money) {
        int remainInCoins = money.getTotalInCoins() - getTotalInCoins();
        return new Money(remainInCoins);
    }

    public Money add(Money right) {
        int newCoinsTotal = right.getTotalInCoins() + right.getTotalInCoins();
        return new Money(newCoinsTotal);
    }

}
