package org.example.model;

public class Coke extends ProductForSale{
    private boolean isDiet;

    public Coke(String type, int price, String description) {
        super(type, price, description);
        this.isDiet = false;
    }

    public void setDiet(boolean isDiet) {
        this.isDiet = isDiet;
    }

    @Override
    public void showDetails() {
        System.out.println("Product: " + getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Diet Version: " + (isDiet ? "Yes" : "No"));
    }
}
