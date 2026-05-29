package org.example;

import java.util.Scanner;

public class OrderScreen {
    private Scanner scanner = new Scanner(System.in);
    private Order order = new Order();

    public void display() {
        int choice = -1;

        while (choice != 0) {
            System.out.println("==============================");
            System.out.println("         Your Order           ");
            System.out.println("==============================");
            System.out.println("1) Add Drink");
            System.out.println("2) Add Loose Leaf Tea");
            System.out.println("3) Add Snack");
            System.out.println("4) Book Tea Ceremony");
            System.out.println("5) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    AddDrinkScreen addDrinkScreen = new AddDrinkScreen();
                    TeaDrink drink = addDrinkScreen.display();
                    order.addDrink(drink);
                    System.out.println("Drink added to your order!");break;
                case 2:
                    AddLooseLeafTeaScreen addTeaScreen = new AddLooseLeafTeaScreen();
                    LooseLeafTea tea = addTeaScreen.display();
                    order.addLooseLeafTea(tea);
                    System.out.println("Tea added to your order!");
                    break;
                case 3:
                    AddSnackScreen addSnackScreen = new AddSnackScreen();
                    SnackPairing snack = addSnackScreen.display();
                    order.addSnack(snack);
                    System.out.println("Snack added to your order!");
                    break;
                case 4:
                    BookCeremonyScreen bookCeremonyScreen = new BookCeremonyScreen();
                    CeremonyBooking booking = bookCeremonyScreen.display();
                    order.addCeremony(booking);
                    System.out.println("Ceremony booked!");
                    break;
                case 5:
                    CheckoutScreen checkoutScreen = new CheckoutScreen();
                    checkoutScreen.display(order);
                    choice = 0;
                    break;
                case 0:
                    System.out.println("Order Cancelled"); break;
                default:
                    System.out.println("Invalid choice, please try again"); break;

            }
        }
    }
}
