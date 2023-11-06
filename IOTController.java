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
            //For 1-3, not sure if we should include a list or make them into a switch for 1.2.3, and include the list
            System.out.println("4. List IOTs");
            //Not sure if we should remove this or add enter IOT through it
            //For example, "4. Choose IOTs -> List of IOTs -> Exit or enter that IOT"
            System.out.println("5. Enter IOTs");
            System.out.println("6. Enable or disable all IOTs");
            System.out.println("7. Exit");
            //System.out.println("7. Choose an IOT to enter");
            //Enter IOT

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createNewIOT(sc);
                    break;
                case 2:
                    listIOTs();
                    deleteIOT(sc);
                    break;
                case 3:
                    listIOTs();
                    editIOT(sc);
                    break;
                case 4:
                    listIOTs();
                    break;
                case 5:
                    System.out.println("Pick an IOT from the list to enter: ");
                    listIOTs();
                    //enterIOTs(); //function here
                    enterIOT(sc);
                    break;
                case 6:
                    enableOrDisable();
                    break;
                //new Method to go to and println enable/disable all IOTs, keep track too.
                //currently, enable and disable is hard coded.
                case 7:
                    System.out.println("Exiting IOT Page");
                    running = false;
                    break;

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

    public static void listIOTs() {
        System.out.println("List of IOTs:");
        for (String iot : iotList) {
            System.out.println(iot);
        }
    } //End method

    //Testing enterIOT
    public static void enterIOT(Scanner sc){
        System.out.println("Choose an IOT to enter");
        String enterIOTName = sc.next();

        if (iotList.contains(enterIOTName)) {
            //Also implement logic here for what is inside IOT?
            System.out.println("You have entered the IOT: " + enterIOTName + "!");
        } else {
            System.out.println("IOT not found!");
        }

    }
    //Above for testing only!

    //This is the logic for the method above, discard the bottom later.
    public static void enterIOTs(){
        //Not finished yet
        //Implement logic here
        //System.out.println("Enter which IOT you would like to enter: ");
        //String enterIOT = sc.nextLine();

        //System.out.println("You have entered the + " + IOTNAMEHERE + "IOT.");
        //1. Ask user to input which IOT they would like to enterIOTs();
        //2. User has entered "Pull from list, if there then display name if not then display not found! loop again"
    }

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
