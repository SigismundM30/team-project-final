import java.util.Scanner;
import java.util.HashMap;
public class UserRegistration {
    public static void register(HashMap<String, Player> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if (users.containsKey(username)) {
            System.out.println("Username already exists. Please choose a different username.");
            return;
        }

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        users.put(username, new Player(username, password));
        System.out.println("Registration successful!");


    }
}