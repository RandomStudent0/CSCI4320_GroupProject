/*package CSCI4320GroupProject; DELETE LATER!!! Testing code

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
*/

package CSCI4320GroupProject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOTController {
    private static List<String> iotList = new ArrayList<>();

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
                    createNewIOT(sc);
                    break;
                case 2:
                    // Implement the logic for deleting an IOT
                    break;
                case 3:
                    // Implement the logic for editing an IOT
                    break;
                case 4:
                    // Implement the logic for listing IOTs and choosing one
                    break;
                case 5:
                    // Implement the logic for enabling all IOTs
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

    public static void createNewIOT(Scanner newIOT) {
        System.out.println("Enter the name of the new IOT:");
        String iotName = newIOT.next();

        if (iotList.contains(iotName)) {
            System.out.println("IOT with the same name already exists. Please choose a different name.");
        } else {
            iotList.add(iotName);
            System.out.println("New IOT '" + iotName + "' created.");
        }
    }
}
