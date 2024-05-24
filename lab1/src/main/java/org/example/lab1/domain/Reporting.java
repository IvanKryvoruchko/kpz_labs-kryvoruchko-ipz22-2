package org.example.lab1.domain;

import java.util.function.Consumer;

public class Reporting {
    public static Consumer<String> output;

    public static void itemIncome(Warehouse warehouse, float amount, Product product) {
        float result = warehouse.addItemToStorage(product, amount);
        String resMsg;

        if (result != amount) {
            resMsg = "Amount increased. New amount " + amount + " " + product.getMeasureUnit();
        } else {
            resMsg = "Item added to storage. Amount: " + amount + " " + product.getMeasureUnit();
        }

        output.accept(resMsg);
    }

    public static void itemOut(Warehouse warehouse, float amount, int productId) {
        String resMsg;
        boolean success = warehouse.takeItemFromStorage(productId, amount);

        Product product = warehouse.getProduct(productId);

        if (product == null) {
            resMsg = "Product is missed in warehouse";
        } else if (success) {
            resMsg = "Successfully departed " + amount + " " + product.getMeasureUnit() + " of " + product.getTitle() + " from warehouse.";
        } else {
            resMsg = "There is no such amount of " + product.getTitle() + " in warehouse.";
        }

        output.accept(resMsg);
    }

    public static void getWarehouseReport(Warehouse warehouse) {
        Product[] products = warehouse.getStoredProducts();

        StringBuilder result = new StringBuilder();

        if (products.length == 0) {
            result.append("Storage is empty");
        } else {
            for (Product storedProduct : products) {
                result.append(storedProduct.getTitle())
                      .append(" - id: ")
                      .append(storedProduct.getId())
                      .append("\nAmount: ")
                      .append(warehouse.getProductAmount(storedProduct.getId()))
                      .append(" ")
                      .append(storedProduct.getMeasureUnit())
                      .append("\nLast arrive: ")
                      .append(warehouse.getLastArrive(storedProduct.getId()))
                      .append("\n");
            }
        }

        output.accept(result.toString());
    }
}
