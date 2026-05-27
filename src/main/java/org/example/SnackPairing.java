package org.example;

public class SnackPairing {
    private String snackName;
    private double price;

    public SnackPairing(String snackName, double price) {
        this.snackName = snackName;
        this.price = price;
    }

    public String getSnackName() {return snackName;}

    public double getPrice() {return price;}

    @Override
    public String toString() {
        return snackName + " ($" + price + ")";
    }
}
