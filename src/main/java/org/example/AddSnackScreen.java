package org.example;

import java.util.Scanner;

public class AddSnackScreen {
    private Scanner scanner = new Scanner(System.in);

    public SnackPairing display() {

        System.out.println("==============================");
        System.out.println("         Select Snack         ");
        System.out.println("==============================");
        System.out.println("1) Assorted Cookies  - $2.50");
        System.out.println("2) Mochi (2 pieces)  - $2.50");
        System.out.println("3) Crackers & Spread - $2.50");
        System.out.print("Enter your choice: ");

        String snackName = "";
        while (snackName.isEmpty()) {
            switch (scanner.nextInt()) {
                case 1: snackName = "Assorted Cookies"; break;
                case 2: snackName = "Mochi"; break;
                case 3: snackName = "Crackers & Spread"; break;
                default: System.out.println("Invalid choice. Please enter 1, 2 or 3:");
            }
        }

        SnackPairing snack = new SnackPairing(snackName);
        System.out.println("\nSnack added: " + snack);

        return snack;
    }
}
