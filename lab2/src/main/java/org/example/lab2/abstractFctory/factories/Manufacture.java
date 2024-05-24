package org.example.lab2.abstractFctory.factories;

import org.example.lab2.abstractFctory.products.EBook;
import org.example.lab2.abstractFctory.products.Laptop;
import org.example.lab2.abstractFctory.products.Smartphone;

public interface Manufacture {
    EBook createEbook();
    Laptop createLaptop();
    Smartphone createSmartphone();
}
