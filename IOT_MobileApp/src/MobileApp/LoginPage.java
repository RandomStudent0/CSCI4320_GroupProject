//Login page need to split actions with Client
//Many values are static to remove errors, find out if actually needed

package MobileApp;

public class LoginPage {
    //Boolean values to express correct credentials
    static boolean acc_user = false; 
    static boolean acc_pass = false;

    //Resets the boolean values back to false
    static void Reset(){
        acc_user = false; 
        acc_pass = false;
    }

    //Dummy values for checking username and password
    //Actual values likely stored in database and not here
    static String [] usernames = {"Person1"}; 
    static String [] passwords = {"Password1"};
    
    //Check User method
    //Dummy code; likely will replace with query of database
    static public void CheckUser(String username){
        for (int i = 0; i < usernames.length; i++){
            if (usernames[i].equals(username))
                   acc_user = true;
            else
                System.out.println("Invalid Username. Please try again.");
        }
    }

    //Check Password method
    //Dummy code; likely will replace with query of database
    static public void CheckPass(String password){
        for (int i = 0; i < passwords.length; i++){
            if (passwords[i].equals(password))
                   acc_pass = true;
            else
                System.out.println("Invalid Password. Please try again.");
        }
    }

    //Login steps
    static public void login(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        do {
            //Resets boolean values for each attempt at entering username and password
            Reset();

            //Retrieves username and password from user
            System.out.println("[Dummy Login Screen]");
            System.out.print("Enter Username: ");
            String user = sc.nextLine();
            System.out.print("Enter Password: ");
            String pass = sc.nextLine();
            
            //Checks if the user is a valid user
            CheckUser(user);
            CheckPass(pass);
        } while (acc_user == false || acc_pass == false);
        sc.close();
    }
}