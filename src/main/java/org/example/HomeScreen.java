package org.example;

import java.util.Scanner;

public class HomeScreen {
    private Scanner scanner = new Scanner(System.in);

    public void display() {
        int choice = 1;

        while (choice != 0) {
            System.out.println("==============================");
            System.out.println("   Welcome to What's Tea! 🍵  ");
            System.out.println("==============================");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    OrderScreen orderScreen = new OrderScreen();
                    orderScreen.display();
                    break;
                case 0:
                    System.out.println("Thanks for visiting What's Tea. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}