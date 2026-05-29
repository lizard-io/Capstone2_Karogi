package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<TeaDrink> drinks;
    private List<LooseLeafTea> looseleafTeas;
    private List<SnackPairing> snacks;
    private List<CeremonyBooking> ceremonies;

    public Order() {
        drinks = new ArrayList<>();
        looseleafTeas = new ArrayList<>();
        snacks = new ArrayList<>();
        ceremonies = new ArrayList<>();
    }

    public void addDrink(TeaDrink drink) {
        drinks.add(drink);
    }

    public void addLooseLeafTea(LooseLeafTea tea) {
        looseleafTeas.add(tea);
    }

    public void addSnack(SnackPairing snack) {
        snacks.add(snack);
    }

    public void addCeremony(CeremonyBooking ceremony) {ceremonies.add(ceremony);}

    public List<TeaDrink> getDrinks() {return drinks;}

    public List<LooseLeafTea> getLooseLeafTeas() {return looseleafTeas;}

    public List<SnackPairing> getSnacks() {return snacks;}

    public List<CeremonyBooking> getCeremonies() {return ceremonies;}

    public double getTotal() {
        double total = 0;

        for (TeaDrink drink : drinks) {
            total += drink.getPrice();
        }
        for (LooseLeafTea tea : looseleafTeas) {
            total += tea.getPrice();
        }
        for (SnackPairing snack : snacks) {
            total += snack.getPrice();
        }
        for (CeremonyBooking ceremony : ceremonies) {
            total += ceremony.getPrice();
        }

        return total;

    }

    @Override
    public String toString() {
        return "--- Your Order ---\n" +
                "Drinks: " + drinks + "\n" +
                "Loose Leaf Teas: " + looseleafTeas + "\n" +
                "Snacks: " + snacks + "\n" +
                "Ceremonies: " + ceremonies + "\n" +
                "Total: $" + getTotal();
    }
}
