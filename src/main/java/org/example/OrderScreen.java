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
                    System.out.println("Enter Loose Leaf Tea"); break;
                case 3:
                    System.out.println("Enter Snack"); break;
                case 4:
                    System.out.println("Book Tea Ceremony"); break;
                case 5:
                    System.out.println("Checkout"); break;
                case 0:
                    System.out.println("Order Cancelled"); break;
                default:
                    System.out.println("Invalid choice, please try again"); break;

            }
        }
    }
}
