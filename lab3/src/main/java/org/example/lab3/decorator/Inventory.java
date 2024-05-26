package org.example.lab3.decorator;

import java.util.ArrayList;
import java.util.List;
import org.example.lab3.decorator.items.Item;
import lombok.Getter;

@Getter
public class Inventory {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }
}
