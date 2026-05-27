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

    public TeaDrink(String drinkType, String size, String teaBase, String sweetnessLevel, String iceLevel, String milkOption, List<AddOn> addOns) {
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

    @Override
    public String toString(){
        return drinkType + " (" + size + ") - " + teaBase +
                " | Sweetness: " + sweetnessLevel +
                " | Ice: " + iceLevel +
                " | Milk: " + milkOption +
                " | Add-ons: " + addOns.toString();
    }
}
