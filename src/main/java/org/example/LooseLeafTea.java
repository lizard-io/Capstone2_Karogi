package org.example;

public class LooseLeafTea {
    private String teaName;
    private String category;
    private double price = 15.99;

    public LooseLeafTea(String teaName, String category) {
        this.teaName = teaName;
        this.category = category;
    }

    public String getTeaName() {return teaName;}
    public String getCategory() {return category;}
    public double getPrice() {return price;}

    @Override
    public String toString() {
        return teaName + " (" + category + ") - 150g bag - $" + price;
    }
}
