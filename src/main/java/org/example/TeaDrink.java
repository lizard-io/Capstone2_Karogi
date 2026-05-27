package org.example;

import java.util.ArrayList;
import java.util.List;

public class TeaDrink {
    private String drinkType;
    private String size;
    private String teaBase;
    private String sweetnessLevel;
    private String iceLevel;
    private String milkOption;
    private List<AddOn> addOns;

    public TeaDrink(String drinkType, String size, String teaBase, String sweetnessLevel, String iceLevel, String milkOption) {
        this.drinkType = drinkType;
        this.size = size;
        this.teaBase = teaBase;
        this.sweetnessLevel = sweetnessLevel;
        this.iceLevel = iceLevel;
        this.milkOption = milkOption;
        this.addOns = new ArrayList<AddOn>();
    }

    public String getDrinkType() {return drinkType;}
    public String getSize() {return size;}
    public String getTeaBase() {return teaBase;}
    public String getSweetnessLevel() {return sweetnessLevel;}
    public String getIceLevel() {return iceLevel;}
    public String getMilkOption() {return milkOption;}
    public List<AddOn> getAddOns() {return addOns;}

    public double getPrice() {
        double basePrice = 0;

        switch (size) {
            case "8oz":  basePrice = 2.50; break;
            case "12oz": basePrice = 3.00; break;
            case "16oz": basePrice = 3.75; break;
            case "24oz": basePrice = 4.50; break;
        }

        // add up all add-on prices
        for (AddOn addOn : addOns) {
            basePrice += addOn.getPrice();
        }

        return basePrice;
    }
    @Override
    public String toString(){
        return drinkType + " (" + size + ") - " + teaBase +
                " | Sweetness: " + sweetnessLevel +
                " | Ice: " + iceLevel +
                " | Milk: " + milkOption +
                " | Add-ons: " + addOns.toString();
    }
}
