public class Main {
    public static void main(String[] args) {
        UserLogin1 userLogin = new UserLogin1();
        boolean loggedIn = userLogin.login();

        if (loggedIn) {
            // If the user is logged in, execute the main method of the VideoGameDatabase class
            VideoGameDatabase.main(args);
        }
        else {
            // If login fails, display a message indicating the failure
            System.out.println("Login failed. VideoGame class will not be executed.");
        }
    }
}
