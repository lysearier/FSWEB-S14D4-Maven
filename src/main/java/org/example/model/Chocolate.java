package org.example.model;

public class Chocolate extends ProductForSale{
    private int cocoaPercentage;


    public Chocolate(String type, int price, String description) {
        super(type, price, description);
        this.cocoaPercentage = 31;
    }

    @Override
    public void showDetails() {
        System.out.println("Product: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Percentage: " + cocoaPercentage + "%");
    }
}
