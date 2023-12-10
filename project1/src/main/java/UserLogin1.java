import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserLogin1 {
    private static HashMap<String, Player> users = new HashMap<>();

    public boolean login() {
        users.put("Dave", new Player("Dave", "dave1234"));
        users.put("Vincent", new Player("Vincent", "050129"));
        users.put("Bob", new Player("Bob", "12524525"));
        users.put("1", new Player("1", "1"));

        Scanner scanner = new Scanner(System.in);
        String username = "";
        String password = "";
        boolean loggedIn = false;
        System.out.print("\033[1;31m");//https://blog.csdn.net/u014470361/article/details/81512330  change color
        System.out.print("___       ________________ _____________________  _________________\n" +
                "__ |     / /__  ____/__  / __  ____/_  __ \\__   |/  /__  ____/__  /\n" +
                "__ | /| / /__  __/  __  /  _  /    _  / / /_  /|_/ /__  __/  __  / \n" +
                "__ |/ |/ / _  /___  _  /___/ /___  / /_/ /_  /  / / _  /___   /_/  \n" +
                "____/|__/  /_____/  /_____/\\____/  \\____/ /_/  /_/  /_____/  (_) :)   \n");//ASCII
        System.out.print("\033[1;34m");
        System.out.print("Do you want to register? (Y/N): ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            UserRegistration.register(users);
        }

        while (!loggedIn) {
            System.out.print("ENTER YOUR NAME: ");
            username = scanner.nextLine();
            System.out.print("enter your password: ");
            password = scanner.nextLine();

            if (username.equals("EasterEgg") && password.equals(":)")) {
                System.out.println("Congratulations! You found the Easter Egg!");
                System.out.println("--Yu Bonan");
                System.out.print("\033[1;34m");
                System.out.println("__     _____ _   _  ____ _____ _   _ _____  __   ___   _ \n" +
                        "\\ \\   / /_ _| \\ | |/ ___| ____| \\ | |_   _| \\ \\ / / | | |\n" +
                        " \\ \\ / / | ||  \\| | |   |  _| |  \\| | | |    \\ V /| | | |\n" +
                        "  \\ V /  | || |\\  | |___| |___| |\\  | | |     | | | |_| |\n" +
                        "   \\_/  |___|_| \\_|\\____|_____|_| \\_| |_|     |_|  \\___/ ");
                loggedIn = true;
            } else if (users.containsKey(username) && users.get(username).getPassword().equals(password)) {
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

class UserRegistration {
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

