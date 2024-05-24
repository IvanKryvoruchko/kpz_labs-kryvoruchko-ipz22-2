package org.example.lab1.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private int id;
    private String title;
    private String description;
    private String measureUnit;
    private Money price;

    public String decreasePrice(Money value) {
        if (value.isLessThan(price) || value.equals(price)) {
            return "The price for decrease should be lower or equal price. Price: " + price;
        }
        price = price.subtract(value);
        return "New price: " + price;
    }

    public String increasePrice(Money value) {
        price = price.add(value);
        return "New price: " + price;
    }
}
