package org.example.lab2.abstractFctory.products;

public abstract class Product {
    public final String Name;
    public final double Price;
    public final String Manufacturer;

    public Product(String name, double price, String manufacturer) {
        this.Name = name;
        this.Price = price;
        this.Manufacturer = manufacturer;
    }

    public void getProductInfo() {
        System.out.println("======== Information about " + getClass().getSimpleName() + " " + Name + " ========");
        System.out.println("Manufacturer: " + Manufacturer);
        System.out.println("Price: " + Price);
        System.out.println();
    }
}
