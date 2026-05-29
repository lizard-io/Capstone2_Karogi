package org.example;

import java.util.Scanner;

public class AddLooseLeafTeaScreen {
    private Scanner scanner = new Scanner(System.in);
    //Select Category
    public LooseLeafTea display(){
        System.out.println("==============================");
        System.out.println("       Select Category        ");
        System.out.println("==============================");
        System.out.println("1) Green Tea");
        System.out.println("2) Oolong Tea");
        System.out.println("3) Black Tea");
        System.out.println("4) Herbal");
        System.out.println("5) Matcha");
        System.out.println("6) Pu-erh");
        System.out.print("Enter your choice: ");

        String category = "";
        while (category.isEmpty()) {
            switch (scanner.nextInt()) {
                case 1: category = "Green Tea"; break;
                case 2: category = "Oolong Tea"; break;
                case 3: category = "Black Tea"; break;
                case 4: category = "Herbal"; break;
                case 5: category = "Matcha"; break;
                case 6: category = "Pu-erh"; break;
                default: System.out.println("Invalid choice. Please enter 1 to 6:");
            }
        }
        //Select Tea by Category
        System.out.println("==============================");
        System.out.println("         Select Tea           ");
        System.out.println("==============================");

        String teaName = "";
        while (teaName.isEmpty()) {
            switch (category) {
                case "Green Tea":
                    System.out.println("1) Sencha");
                    System.out.println("2) Jasmine Green");
                    System.out.println("3) Dragonwell");
                    System.out.println("4) Gyokuro");
                    System.out.print("Enter your choice: ");
                    switch (scanner.nextInt()) {
                        case 1: teaName = "Sencha"; break;
                        case 2: teaName = "Jasmine Green"; break;
                        case 3: teaName = "Dragonwell"; break;
                        case 4: teaName = "Gyokuro"; break;
                        default: System.out.println("Invalid choice. Please enter 1 to 4:");
                    }
                    break;
                case "Oolong Tea":
                    System.out.println("1) Tie Guan Yin");
                    System.out.println("2) Da Hong Pao");
                    System.out.println("3) Dong Ding");
                    System.out.print("Enter your choice: ");
                    switch (scanner.nextInt()) {
                        case 1: teaName = "Tie Guan Yin"; break;
                        case 2: teaName = "Da Hong Pao"; break;
                        case 3: teaName = "Dong Ding"; break;
                        default: System.out.println("Invalid choice. Please enter 1 to 3:");
                    }
                    break;
                case "Black Tea":
                    System.out.println("1) Assam");
                    System.out.println("2) Darjeeling");
                    System.out.println("3) Earl Grey");
                    System.out.println("4) Lapsang Souchong");
                    System.out.print("Enter your choice: ");
                    switch (scanner.nextInt()) {
                        case 1: teaName = "Assam"; break;
                        case 2: teaName = "Darjeeling"; break;
                        case 3: teaName = "Earl Grey"; break;
                        case 4: teaName = "Lapsang Souchong"; break;
                        default: System.out.println("Invalid choice. Please enter 1 to 4:");
                    }
                    break;
                case "Herbal":
                    System.out.println("1) Chamomile");
                    System.out.println("2) Hibiscus");
                    System.out.println("3) Peppermint");
                    System.out.println("4) Rooibos");
                    System.out.print("Enter your choice: ");
                    switch (scanner.nextInt()) {
                        case 1: teaName = "Chamomile"; break;
                        case 2: teaName = "Hibiscus"; break;
                        case 3: teaName = "Peppermint"; break;
                        case 4: teaName = "Rooibos"; break;
                        default: System.out.println("Invalid choice. Please enter 1 to 4:");
                    }
                    break;
                case "Matcha":
                    System.out.println("1) Ceremonial Grade");
                    System.out.println("2) Culinary Grade");
                    System.out.print("Enter your choice: ");
                    switch (scanner.nextInt()) {
                        case 1: teaName = "Ceremonial Grade Matcha"; break;
                        case 2: teaName = "Culinary Grade Matcha"; break;
                        default: System.out.println("Invalid choice. Please enter 1 or 2:");
                    }
                    break;
                case "Pu-erh":
                    System.out.println("1) Sheng (Raw)");
                    System.out.println("2) Shou (Ripe)");
                    System.out.print("Enter your choice: ");
                    switch (scanner.nextInt()) {
                        case 1: teaName = "Sheng Pu-erh"; break;
                        case 2: teaName = "Shou Pu-erh"; break;
                        default: System.out.println("Invalid choice. Please enter 1 or 2:");
                    }
                    break;
            }
        }

        LooseLeafTea tea = new LooseLeafTea(teaName, category);
        System.out.println("\nLoose leaf tea added: " + tea);
        return tea;
    }
}
