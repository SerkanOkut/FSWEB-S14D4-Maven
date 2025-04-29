package org.example.model;

public class Store {

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Milk Chocolate", 30.0, "Delicious milk chocolate", "45%");
        products[1] = new Coke("Coca Cola", 20.0, "Refreshing soda drink", 330);
        products[2] = new Bread("Sourdough", 15.0, "Fresh sourdough bread", "Whole Wheat");

        listProducts(products);
    }
}
