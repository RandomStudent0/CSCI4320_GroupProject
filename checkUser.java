package AbstractFactory;

public class checkUser {
    private String[][] userCredentials;

    public checkUser() {
        // 2D array for user info
        userCredentials = new String[][] {
                {"dummy1", "password1"},
                {"dummy2", "password2"},
                {"dummy3", "password3"},
                {"dummy4", "password4"},
        }; // End 2D array
    } // End constructor

    public boolean validUser(String userName, String passWord) {
        for (int i = 0; i < userCredentials.length; i++) {
            if (userCredentials[i][0].equals(userName) && userCredentials[i][1].equals(passWord)) {
                return true; // A valid user
            }
        }
        return false; // Not a valid user
    }
}
