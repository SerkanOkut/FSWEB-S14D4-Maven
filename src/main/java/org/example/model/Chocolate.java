package org.example.model;

public class Chocolate extends ProductForSale {
    private String cocoaRatio;

    public Chocolate(String type, double price, String description, String cocoaRatio) {
        super(type, price, description);
        this.cocoaRatio = cocoaRatio;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate Details:");
        System.out.println("- Type: " + getType());
        System.out.println("- Price: " + getPrice() + "₺");
        System.out.println("- Description: " + getDescription());
        System.out.println("- Cocoa Ratio: " + cocoaRatio);
    }
}
