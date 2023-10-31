import java.util.*;

public class Client{
	
 public static HashMap<String, String> users = new HashMap<String, String>();
	
 public static void main(String arg[])	
 {
   Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 3) {
            System.out.println("Select an option: ");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Quit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    registar(scanner);
                    break;
                case 2:
                    loginUser(scanner);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }	 



  public static void registar(Scanner scanner){
   String username;
   String password;
   System.out.println("Enter your username: ");
   username = scanner.nextLine();
  
    System.out.println("Enter your password: ");
    password = scanner.nextLine();
     
    if(users.containsKey(username)){
	System.out.println("User already exists.");
	}else{
	users.put(username,password);
	System.out.println("Registration successful");
	}
 
 
 }
 
   public static void loginUser(Scanner scanner) {
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        if (!users.containsKey(username)) {
            System.out.println("Invalid username or password.");
        } else {
            if (users.get(username).equals(password)) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Invalid username or password.");
            }
        }
    }


}