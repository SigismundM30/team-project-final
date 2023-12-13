import java.util.HashMap;
//jetbrains://idea/navigate/reference?project=Main.java&path=D:/OpenJDK21U-jdk_x64_windows_hotspot_21_35/jdk-21+35/lib/src.zip!/java.base/java/util/HashMap.java
import java.util.Scanner;

public class UserLogin1 {
    private static final HashMap<String, Player> users = new HashMap<>(); // HashMap to store user information

    public boolean login() {
        users.put("Dave", new Player("dave1234")); // Adding user "Dave" with password "dave1234"
        users.put("Vincent", new Player("050129")); // Adding user "Vincent" with password "050129"
        users.put("Bobby", new Player("Bobby20050723")); // Adding user "Bobby" with password "Bobby20050723"
        users.put("Sophia", new Player("Sophia20041104")); // Adding user "Sophia" with password "Sophia20041104"

        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        boolean loggedIn = false;
        System.out.print("\033[1;31m"); // Changing console text color to red
        System.out.print("___       ________________ _____________________  _________________\n" +
                "__ |     / /__  ____/__  / __  ____/_  __ \\__   |/  /__  ____/__  /\n" +
                "__ | /| / /__  __/  __  /  _  /    _  / / /_  /|_/ /__  __/  __  / \n" +
                "__ |/ |/ / _  /___  _  /___/ /___  / /_/ /_  /  / / _  /___   /_/  \n" +
                "____/|__/  /_____/  /_____/\\____/  \\____/ /_/  /_/  /_____/  (_) :)   \n"); // ASCII art
        System.out.print("\033[1;34m"); // Changing console text color to blue

        while (!loggedIn) {
            System.out.print("ENTER YOUR NAME: ");
            username = scanner.nextLine();
            System.out.print("enter your password: ");
            password = scanner.nextLine();

            if (username.equals("EasterEgg") && password.equals(":)")) { // Checking for Easter Egg username and password
                System.out.println("Congratulations! You found the Easter Egg!");
                System.out.println("--Yu Bonan");
                System.out.print("\033[1;34m");
                loggedIn = true;
            } else if (users.containsKey(username) && users.get(username).getPassword().equals(password)) { // Checking if the entered username and password match the stored values
                System.out.println("Login successful!");
                loggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        return true;
    }

    public static void main(String[] args) {
        UserLogin1 userLogin = new UserLogin1();
        userLogin.login();
    }
}
