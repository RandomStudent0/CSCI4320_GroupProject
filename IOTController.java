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
            System.out.println("4. List IOTs");
            System.out.println("5. Enable all IOTs");
            System.out.println("6. Exit");
            //Not sure how to enter IOT

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createNewIOT(sc);
                    break;
                case 2:
                    deleteIOT(sc);
                    break;
                case 3:
                    editIOT(sc);
                    break;
                case 4:
                    listIOTs();
                    break;
                case 5:
                    //Not Done
                    //enableAllIOTs();
                    break;
                case 6:
                    System.out.println("Exiting IOT Page");
                    running = false;
                    break;
                    //Case 7 - Enter IOT?
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            } //End switches
        } //End loop
    } //End method

    public static void createNewIOT(Scanner newIOT) {
        System.out.println("Enter the name of the new IOT: ");
        String iotName = newIOT.next();

        if (iotList.contains(iotName)) {
            System.out.println("This IOT name already exists, please choose a different name.");
        } else {
            iotList.add(iotName);
            System.out.println("New IOT " + iotName + " has been created.");
        }
    } //End method

    public static void deleteIOT(Scanner sc) {
        System.out.println("Enter the name of the IOT to delete:");
        String iotName = sc.next();

        if (iotList.remove(iotName)) {
            System.out.println("IOT '" + iotName + "' deleted.");
        } else {
            System.out.println("IOT not found. Cannot delete.");
        }
    } //End method



    public static void editIOT(Scanner sc) {
        System.out.println("Enter the name of the IOT you want to edit:");
        String oldIOTName = sc.next();

        if (iotList.contains(oldIOTName)) {
            System.out.println("Enter the new name for the IOT:");
            String newIOTName = sc.next();

            if (iotList.contains(newIOTName)) {
                System.out.println("This IOT name already exists, please choose a different name.");
            } else {
                int index = iotList.indexOf(oldIOTName);
                iotList.set(index, newIOTName);
                System.out.println("IOT " + oldIOTName + " has been changed to " + newIOTName + ".");
            }
        } else {
            System.out.println("IOT not found!");
        }
    } //End method

    //List IOT
    public static void listIOTs() {
        System.out.println("List of IOTs:");
        for (String iot : iotList) {
            System.out.println(iot);
        }
    } //End method

    //Not Done Yet
    public static void enableAllIOTs() {
        System.out.println("Enabling all IOTs.");
        // Figure out how to enable all IOTs
    } //End method

} //End class
