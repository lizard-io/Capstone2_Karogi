package org.example;

import java.util.Scanner;

public class AddDrinkScreen {
    private Scanner scanner = new Scanner(System.in);

    public TeaDrink display() {

        //Drink Type
        System.out.println("==============================");
        System.out.println("       Select Drink Type      ");
        System.out.println("==============================");
        System.out.println("1) Hot Tea");
        System.out.println("2) Iced Tea");
        System.out.println("3) Milk Tea/Latte");
        System.out.println("4) Specialty Blend");
        System.out.print("Enter your choice: ");

        String drinkType = "";
        switch (scanner.nextInt()) {
            case 1:
                drinkType = "Hot Tea";break;
            case 2:
                drinkType = "Iced Tea";break;
            case 3:
                drinkType = "Milk Tea/Latte";break;
            case 4:
                drinkType = "Specialty Blend";break;
            default:
                drinkType = "Hot Tea";
        }

        //Drink size
        System.out.println("==============================");
        System.out.println("         Select Size          ");
        System.out.println("==============================");
        System.out.println("1) 8oz  - $2.50");
        System.out.println("2) 12oz - $3.00");
        System.out.println("3) 16oz - $3.75");
        System.out.println("4) 24oz - $4.50");
        System.out.print("Enter your choice: ");

        String size = "";
        switch (scanner.nextInt()) {
            case 1:
                size = "8oz";break;
            case 2:
                size = "12oz";break;
            case 3:
                size = "16oz";break;
            case 4:
                size = "24oz";break;
            default:
                size = "12oz";
        }

        //Tea Base
        System.out.println("==============================");
        System.out.println("       Select Tea Base        ");
        System.out.println("==============================");
        System.out.println("--- Green Teas ---");
        System.out.println("1) Sencha");
        System.out.println("2) Jasmine Green");
        System.out.println("3) Dragonwell");
        System.out.println("--- Oolong Teas ---");
        System.out.println("4) Tie Guan Yin");
        System.out.println("5) Da Hong Pao");
        System.out.println("--- Black Teas ---");
        System.out.println("6) Assam");
        System.out.println("7) Earl Grey");
        System.out.println("--- Herbal ---");
        System.out.println("8) Chamomile");
        System.out.println("9) Peppermint");
        System.out.println("--- Matcha ---");
        System.out.println("10) Ceremonial Matcha");
        System.out.print("Enter your choice: ");

        String teaBase = "";
        switch (scanner.nextInt()) {
            case 1:
                teaBase = "Sencha";break;
            case 2:
                teaBase = "Jasmine Green";break;
            case 3:
                teaBase = "Dragonwell";break;
            case 4:
                teaBase = "Tie Guan Yin";break;
            case 5:
                teaBase = "Da Hong Pao";break;
            case 6:
                teaBase = "Assam";break;
            case 7:
                teaBase = "Earl Grey";break;
            case 8:
                teaBase = "Chamomile";break;
            case 9:
                teaBase = "Peppermint";break;
            case 10:
                teaBase = "Ceremonial Matcha";break;
            default:
                teaBase = "Sencha";
        }

        //Sweetness level
        System.out.println("==============================");
        System.out.println("     Select Sweetness Level   ");
        System.out.println("==============================");
        System.out.println("1) None (0%)");
        System.out.println("2) Light (25%)");
        System.out.println("3) Half (50%)");
        System.out.println("4) Regular (75%)");
        System.out.println("5) Full (100%)");
        System.out.print("Enter your choice: ");

        String sweetnessLevel = "";
        switch (scanner.nextInt()) {
            case 1:
                sweetnessLevel = "None";
                break;
            case 2:
                sweetnessLevel = "Light";
                break;
            case 3:
                sweetnessLevel = "Half";
                break;
            case 4:
                sweetnessLevel = "Regular";
                break;
            case 5:
                sweetnessLevel = "Full";
                break;
            default:
                sweetnessLevel = "Regular";
        }

        //Ice level(Skips for hot drinks)
        String iceLevel = "No Ice";
        if (!drinkType.equals("Hot Tea")) {
            System.out.println("==============================");
            System.out.println("       Select Ice Level       ");
            System.out.println("==============================");
            System.out.println("1) No Ice");
            System.out.println("2) Light Ice");
            System.out.println("3) Regular Ice");
            System.out.println("4) Extra Ice");
            System.out.print("Enter your choice: ");

            switch (scanner.nextInt()) {
                case 1:
                    iceLevel = "No Ice";break;
                case 2:
                    iceLevel = "Light Ice";break;
                case 3:
                    iceLevel = "Regular Ice";break;
                case 4:
                    iceLevel = "Extra Ice";break;
                default:
                    iceLevel = "Regular Ice";
            }
        }

            //Milk Option(Only for milk teas)
            String milkOption = "None";
            if (drinkType.equals("Milk Tea/Latte")) {
                System.out.println("==============================");
                System.out.println("       Select Milk Option     ");
                System.out.println("==============================");
                System.out.println("1) Whole Milk");
                System.out.println("2) Oat Milk    (+$0.75)");
                System.out.println("3) Almond Milk (+$0.75)");
                System.out.println("4) Coconut Milk (+$0.75)");
                System.out.print("Enter your choice: ");

                switch (scanner.nextInt()) {
                    case 1:
                        milkOption = "Whole";break;
                    case 2:
                        milkOption = "Oat";break;
                    case 3:
                        milkOption = "Almond";break;
                    case 4:
                        milkOption = "Coconut";break;
                    default:
                        milkOption = "Whole";
                }
            }

            //TeaDrink Object - Complete Order
            TeaDrink drink = new TeaDrink(drinkType, size, teaBase, sweetnessLevel, iceLevel, milkOption);

            //Add Ons
            System.out.println("==============================");
            System.out.println("          Add-Ons             ");
            System.out.println("==============================");
            System.out.println("1) Boba/Tapioca Pearls (+$0.75)");
            System.out.println("2) Lychee Jelly        (+$0.75)");
            System.out.println("3) Grass Jelly         (+$0.75)");
            System.out.println("4) Extra Tea Shot      (+$0.50)");
            System.out.println("0) No add-ons");
            System.out.print("Enter your choice: ");

            int addOnChoice = scanner.nextInt();
            if (addOnChoice != 0) {
                switch (addOnChoice) {
                    case 1:
                        drink.addAddOn(new AddOn("Boba", true, 0.75));
                        break;
                    case 2:
                        drink.addAddOn(new AddOn("Lychee Jelly", true, 0.75));
                        break;
                    case 3:
                        drink.addAddOn(new AddOn("Grass Jelly", true, 0.75));
                        break;
                    case 4:
                        drink.addAddOn(new AddOn("Extra Tea Shot", false, 0.50));
                        break;
                }
            }
            System.out.println("==============================");
            System.out.println("          Add-Ons             ");
            System.out.println("==============================");
            System.out.println("1) Boba/Tapioca Pearls (+$0.75)");
            System.out.println("2) Lychee Jelly        (+$0.75)");
            System.out.println("3) Grass Jelly         (+$0.75)");
            System.out.println("4) Extra Tea Shot      (+$0.50)");
            System.out.println("0) No add-ons");
            System.out.print("Enter your choice: ");

        // Confirm
        System.out.println("\nDrink added: " + drink);
        System.out.println("Price: $" + drink.getPrice());

        return drink;
            }
        }