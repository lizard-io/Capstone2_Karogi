package org.example;


public class CeremonyBooking {
    private String type;
    private int guests;
    private String slot;
    private double price;

    public CeremonyBooking(String type, int guests, String slot) {
        this.type = type;
        this.guests = guests;
        this.slot = slot;
        this.price = (guests >= 4) ? 30.00 * guests : 35.0 * guests;
    }

    public String getType() {return type;}

    public int getGuests() {return guests;}

    public String getSlot() {return slot;}
    public double getPrice() {return price;}

    @Override
    public String toString() {
        return type + " | " + guests + " guests | " + slot + " | $" + price;
    }
}
