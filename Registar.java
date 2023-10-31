public class Registar{


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