package org.example.enums;

public enum Plan {
    BASIC("Basic plan", 10.0),
    STANDARD("Standard plan", 20.0),
    PREMIUM("Premium plan", 30.0);

    private String name;
    private double price;

    Plan(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
