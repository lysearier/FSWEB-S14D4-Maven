package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("a", 1, "b");
        products[1] = new Coke("c", 2, "d");
        products[2] = new Bread("e", 3, "f");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale productForSale : products) {
            productForSale.showDetails();
        }
    }
}