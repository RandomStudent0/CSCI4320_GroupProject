package CSCI4320GroupProject;

import java.util.Scanner;

public class IOTController {
    public static void startIOTPage() {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Java - Welcome to IOT Page");
            System.out.println("Commands:");
            System.out.println("1. Create new IOT");
            System.out.println("2. Delete an IOT");
            System.out.println("3. Edit an IOT");
            System.out.println("4. Enter an IOT - List of IOTs");
            System.out.println("5. Enable all IOTs");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Create an IOT
                    break;
                case 2:
                    // Delete an IOT
                    break;
                case 3:
                    // Edit an IOT
                    break;
                case 4:
                    // List of IOTs
                    break;
                case 5:
                    // Enable button
                    break;
                case 6:
                    System.out.println("Exiting IOT Page");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
