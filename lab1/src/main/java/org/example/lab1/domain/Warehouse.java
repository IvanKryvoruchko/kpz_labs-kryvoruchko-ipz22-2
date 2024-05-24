package org.example.lab1.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Warehouse {
    private final List<StoredProduct> storage = new ArrayList<>();

    public float addItemToStorage(Product product, float amount) {
        for (StoredProduct storedProduct : storage) {
            if (storedProduct.getProduct().getId() == product.getId()) {
                storedProduct.setLastArrive(new Date());
                storedProduct.setAmount(storedProduct.getAmount() + amount);
                return amount;
            }
        }
        storage.add(new StoredProduct(product, amount, new Date()));
        return amount;
    }

    public boolean takeItemFromStorage(int productID, float amount) {
        for (StoredProduct storedProduct : storage) {
            if (storedProduct.getProduct().getId() == productID) {
                if (storedProduct.getAmount() < amount) {
                    return false;
                }
                storedProduct.setAmount(storedProduct.getAmount() - amount);
                return true;
            }
        }
        return false;
    }

    public Product[] getStoredProducts() {
        return storage.stream().map(StoredProduct::getProduct).toArray(Product[]::new);
    }

    public Product getProduct(int productID) {
        for (StoredProduct storedProduct : storage) {
            if (storedProduct.getProduct().getId() == productID) {
                return storedProduct.getProduct();
            }
        }
        return null;
    }

    public float getProductAmount(int id) {
        for (StoredProduct storedProduct : storage) {
            if (storedProduct.getProduct().getId() == id) {
                return storedProduct.getAmount();
            }
        }
        return 0;
    }

    public Date getLastArrive(int id) {
        for (StoredProduct storedProduct : storage) {
            if (storedProduct.getProduct().getId() == id) {
                return storedProduct.getLastArrive();
            }
        }
        return null;
    }
}
