package org.example.model;

public class Bread extends ProductForSale{
    private String size;


    public Bread(String type, int price, String description) {
        super(type, price, description);
        this.size = "Medium";
    }

    @Override
    public void showDetails() {
        System.out.println("Product: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Size: " + size);
    }
}
