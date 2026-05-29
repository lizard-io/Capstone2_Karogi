package org.example;

public class SnackPairing {
    private String snackName;
    private double price = 2.50;

    public SnackPairing(String snackName) {
        this.snackName = snackName;
    }

    public String getSnackName() {return snackName;}

    public double getPrice() {return price;}

    @Override
    public String toString() {
        return snackName + " ($" + price + ")";
    }
}
