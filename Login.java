package AbstractFactory;

import java.util.Scanner;

public class Login {
    public static void getCredentials() {
        Scanner sc = new Scanner(System.in);
        boolean validUser = false; // Initialize as false

        while (!validUser) { // Add a loop to keep trying until the user logs in successfully
            System.out.println("Enter your username: ");
            String userName = sc.nextLine();

            System.out.println("Enter your password: ");
            String passWord = sc.nextLine();

            // Testing to see if it works, remove later
            System.out.println("Username: " + userName);
            System.out.println("Password: " + passWord);

            checkUser checkUserInfo = new checkUser();
            validUser = checkUserInfo.validUser(userName, passWord);

            if (validUser) {
                System.out.println("Login Success!");
            } else {
                System.out.println("Login Failed! Please try again.");
            }
        }
    }
}


