package AbstractFactory;

public class Client {
    public static void main (String[] args) {
        System.out.println("Test");
        Login.getCredentials(); //Asks user to input login info
    }
}
