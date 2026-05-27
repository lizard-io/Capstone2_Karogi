package org.example;

public class AddOn {
    private String name;
    private boolean isPremium;
    private double price;

    public AddOn(String name, boolean isPremium, double price) {
        this.name = name;
        this.isPremium = isPremium;
        this.price = price;
    }

    public String getName() {return name;}
    public double getPrice() {return price;}
    public boolean isPremium() {return isPremium;}
    @Override
    public String toString() {
        return name + " ($" + price + "')";
    }
}
