package org.example;

import java.util.Scanner;

public class CheckoutScreen {
    private static Scanner scanner = new Scanner(System.in);

    public void display(Order order) {

        System.out.println("==============================");
        System.out.println("          Checkout            ");
        System.out.println("==============================");

        if (!order.getDrinks().isEmpty()) {
            System.out.println("--- Drinks ---");
            for (TeaDrink drink : order.getDrinks()) {
                System.out.println(drink);
            }
        }

        if (!order.getLooseLeafTeas().isEmpty()) {
            System.out.println("--- Loose Leaf Teas ---");
            for (LooseLeafTea tea : order.getLooseLeafTeas()) {
                System.out.println(tea);
            }
        }

        if (!order.getSnacks().isEmpty()) {
            System.out.println("--- Snacks ---");
            for (SnackPairing snack : order.getSnacks()) {
                System.out.println(snack);
            }
        }

        if (!order.getCeremonies().isEmpty()) {
            System.out.println("--- Ceremony Bookings ---");
            for (CeremonyBooking booking : order.getCeremonies()) {
                System.out.println(booking);
            }
        }

        System.out.println("==============================");
        System.out.println("Total: $" + order.getTotal());
        System.out.println("==============================");

        System.out.println("1) Confirm Order");
        System.out.println("0) Cancel Order");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        if (choice == 1) {
            FileManager fileManager = new FileManager();
            fileManager.saveReceipt(order);
            System.out.println("Order confirmed! Receipt saved.");
        } else {
            System.out.println("Order cancelled.");
        }

    }
}
