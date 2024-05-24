package org.example.lab1;

import java.util.ArrayList;
import java.util.List;
import org.example.lab1.domain.Money;
import org.example.lab1.domain.Product;
import org.example.lab1.domain.Reporting;
import org.example.lab1.domain.Warehouse;

public class Application {
    public static void main(String[] args) {
        try {
            List<Product> products = new ArrayList<>();
            products.add(new Product(1, "Iphone", "Iphone 15 pro", "pieces", new Money(43000, 35)));
            products.add(new Product(2, "Tomato", "Cherry tomato", "kg", new Money(11, 95)));

            System.out.println(products.get(0).increasePrice(new Money(100, 15)));
            System.out.println(products.get(0).decreasePrice(new Money(200, 0)));
            System.out.println(products.get(0).decreasePrice(new Money(122000, 0)));

            Warehouse warehouse = new Warehouse();

            Reporting.output = Application::printResult;

            Reporting.getWarehouseReport(warehouse);
            Reporting.itemIncome(warehouse, 5, products.get(0));
            Reporting.itemIncome(warehouse, (float) 4.3, products.get(1));
            Reporting.getWarehouseReport(warehouse);
            Reporting.itemOut(warehouse, 1, 1);
            Reporting.getWarehouseReport(warehouse);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void printResult(String message) {
        System.out.println(message);
    }
}
