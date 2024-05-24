package org.example.lab2.abstractFctory;

import org.example.lab2.abstractFctory.factories.BalaxyManufacture;
import org.example.lab2.abstractFctory.factories.IPhoneManufacture;
import org.example.lab2.abstractFctory.factories.KiakomiManufacture;
import org.example.lab2.abstractFctory.factories.Manufacture;

public class App {
    public static void main(String[] args) {
        testFactory(new BalaxyManufacture());
        testFactory(new KiakomiManufacture());
        testFactory(new IPhoneManufacture());
    }

    private static void testFactory(Manufacture manufacture) {
        manufacture.createLaptop().getProductInfo();
        manufacture.createEbook().getProductInfo();
        manufacture.createSmartphone().getProductInfo();
    }
}
