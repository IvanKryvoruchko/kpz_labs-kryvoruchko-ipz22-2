package org.example.lab2.abstractFctory.factories;


import org.example.lab2.abstractFctory.products.EBook;
import org.example.lab2.abstractFctory.products.Laptop;
import org.example.lab2.abstractFctory.products.Smartphone;

public class BalaxyManufacture implements Manufacture {
    @Override
    public EBook createEbook() {
        return new EBook("EBook pro 1", 1800, "Balaxy");
    }

    @Override
    public Laptop createLaptop() {
        return new Laptop("Laptop ultra 4", 4500, "Balaxy");
    }

    @Override
    public Smartphone createSmartphone() {
        return new Smartphone("S900 Max", 900, "Balaxy");
    }
}
