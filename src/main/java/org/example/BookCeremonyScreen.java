package org.example;

import java.util.Scanner;

public class BookCeremonyScreen {
    private Scanner scanner = new Scanner(System.in);

    public CeremonyBooking display() {
        //Select Ceremony
        System.out.println("==============================");
        System.out.println("      Select Ceremony Type    ");
        System.out.println("==============================");
        System.out.println("1) Chinese Gong Fu Cha - $35/person");
        System.out.println("2) Japanese Chado      - $40/person");
        System.out.println("3) Korean Darye        - $35/person");
        System.out.println("   (Groups of 4+ get $30/person)");
        System.out.print("Enter your choice: ");

        String type = "";
        while (type.isEmpty()) {
            switch (scanner.nextInt()) {
                case 1: type = "Gong Fu Cha"; break;
                case 2: type = "Chado"; break;
                case 3: type = "Darye"; break;
                default: System.out.println("Invalid choice. Please enter 1, 2 or 3:");
            }
        }
        //Select Number of Guests
        System.out.println("==============================");
        System.out.println("      Number of Guests        ");
        System.out.println("==============================");
        System.out.println("(Minimum 1, Maximum 10)");
        System.out.print("Enter number of guests: ");

        int guests = 0;
        while (guests < 1 || guests > 10) {
            guests = scanner.nextInt();
            if (guests < 1 || guests > 10) {
                System.out.println("Invalid number. Please enter between 1 and 10:");
            }
        }
        //Select Time Slot
        System.out.println("==============================");
        System.out.println("       Select Time Slot       ");
        System.out.println("==============================");
        System.out.println("1) Morning   (10:00 AM)");
        System.out.println("2) Afternoon (1:00 PM)");
        System.out.println("3) Evening   (4:00 PM)");
        System.out.print("Enter your choice: ");

        String slot = "";
        while (slot.isEmpty()) {
            switch (scanner.nextInt()) {
                case 1: slot = "Morning (10:00 AM)"; break;
                case 2: slot = "Afternoon (1:00 PM)"; break;
                case 3: slot = "Evening (4:00 PM)"; break;
                default: System.out.println("Invalid choice. Please enter 1, 2 or 3:");
            }
        }

        CeremonyBooking booking = new CeremonyBooking(type, guests, slot);

        System.out.println("\nCeremony booked: " + booking);

        return booking;




    }
}
