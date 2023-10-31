//DELETE THIS PART LATER:
/*package CSCI4320GroupProject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOTController {
    private static List<String> iotList = new ArrayList<>();

    public static void startIOTPage() {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to IOT Page");
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
                case 7:
                    System.out.println("Enable or disable all IOTs");
                    //new Method to go to and println enable/disable all IOTs, keep track too.
                case 8:
                    System.out.println("Choose an IOT to enter:");
                    //pull list of IOTs
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

    //Testing

} //End class
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
            System.out.println("Welcome to IOT Page");
            System.out.println("Commands:");
            System.out.println("1. Create new IOT");
            System.out.println("2. Delete an IOT");
            System.out.println("3. Edit an IOT");
            System.out.println("4. List IOTs");
            System.out.println("5. Enable or disable all IOTs");
            System.out.println("6. Exit");
            System.out.println("7. Enable/Disable all IOTs");
            //System.out.println("8. Choose an IOT to enter");
            //Enter IOT

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
                    enableOrDisable();
                    break;
                case 6:
                    System.out.println("Exiting IOT Page");
                    running = false;
                    break;
                case 7:
                    System.out.println("Enable or disable all IOTs");
                    enableOrDisable();
                    break;
                    //new Method to go to and println enable/disable all IOTs, keep track too.
                    //currently, enable and disable is hard coded.
                //case 8:
                  //  System.out.println("Pick an IOT from the list to enter: ");
                    //listIOTs();
                    //pull list of IOTs
                default:
                    System.out.println("Invalid IOT choice. Please try again.");
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
    public static void enableOrDisable() {
        Scanner sc = new Scanner(System.in);

            System.out.println("Do you want to enable or disable all IOTs?");
            System.out.println("1. Enable all IOTs");
            System.out.println("2. Disable all IOTs");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enabled all IOTs");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Disabled all IOTs");
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            } //End switches

    } //End method



} //End class
