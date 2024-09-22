package org.example.enums;

public enum Plan {
    BASIC("Basic plan", 10),
    STANDARD("Standard plan", 20),
    PREMIUM("Premium plan", 30);

    private String name;
    private int price;

    Plan(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public String toString() {
        return getName() + " (Price: $" + getPrice() + ")";
    }
}
