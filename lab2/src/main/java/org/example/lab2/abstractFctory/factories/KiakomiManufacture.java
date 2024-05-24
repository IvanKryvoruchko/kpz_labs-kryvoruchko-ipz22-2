package org.example.lab2.abstractFctory.factories;

import org.example.lab2.abstractFctory.products.EBook;
import org.example.lab2.abstractFctory.products.Laptop;
import org.example.lab2.abstractFctory.products.Smartphone;

public final class KiakomiManufacture implements Manufacture {
    @Override
    public EBook createEbook() {
        return new EBook("K4", 1200, "Kiakomi");
    }

    @Override
    public Laptop createLaptop() {
        return new Laptop("Note 1", 5000, "Kiakomi");
    }

    @Override
    public Smartphone createSmartphone() {
        return new Smartphone("I4", 800, "Kiakomi");
    }
}
