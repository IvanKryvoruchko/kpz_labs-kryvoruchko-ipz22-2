package org.example.lab2.abstractFctory.factories;


import org.example.lab2.abstractFctory.products.EBook;
import org.example.lab2.abstractFctory.products.Laptop;
import org.example.lab2.abstractFctory.products.Smartphone;

public class IPhoneManufacture implements Manufacture {
    @Override
    public EBook createEbook() {
        return new EBook("IPad 4", 3500, "IPhone");
    }

    @Override
    public Laptop createLaptop() {
        return new Laptop("Mac", 5000, "IPhone");
    }

    @Override
    public Smartphone createSmartphone() {
        return new Smartphone("11 Pro", 1500, "IPhone");
    }
}
