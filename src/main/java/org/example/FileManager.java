package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileManager {

    public void saveReceipt(Order order) {
        File folder = new java.io.File("receipts");
        if (!folder.exists()) {
            folder.mkdir();
        }

        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        String filename = "receipts/" + timestamp + ".txt";

        try {
            FileWriter writer = new FileWriter(filename);

            writer.write("==============================\n");
            writer.write("     What's Tea - Receipt     \n");
            writer.write("==============================\n");
            writer.write("Date: " + timestamp + "\n\n");

            // Write drinks
            if (!order.getDrinks().isEmpty()) {
                writer.write("--- Drinks ---\n");
                for (TeaDrink drink : order.getDrinks()) {
                    writer.write(drink.toString() + "\n");
                }
            }

            if (!order.getLooseLeafTeas().isEmpty()) {
                writer.write("--- Loose Leaf Teas ---\n");
                for (LooseLeafTea tea : order.getLooseLeafTeas()) {
                    writer.write(tea.toString() + "\n");
                }
            }

            if (!order.getSnacks().isEmpty()) {
                writer.write("--- Snacks ---\n");
                for (SnackPairing snack : order.getSnacks()) {
                    writer.write(snack.toString() + "\n");
                }
            }

            if (!order.getCeremonies().isEmpty()) {
                writer.write("--- Ceremony Bookings ---\n");
                for (CeremonyBooking booking : order.getCeremonies()) {
                    writer.write(booking.toString() + "\n");
                }
            }

            writer.write("\n==============================\n");
            writer.write("Total: $" + order.getTotal() + "\n");
            writer.write("==============================\n");
            writer.write("Thank you for visiting What's Tea!\n");

            writer.close();

            System.out.println("Receipt saved to: " + filename);

        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());
        }
    }
}
