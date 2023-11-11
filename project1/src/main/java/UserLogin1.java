import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserLogin1 {
    private static HashMap<String, Player> users = new HashMap<>();

    public boolean login() {
        users.put("Dave", new Player("Dave", "dave1234"));
        users.put("Vincent", new Player("Vincent", "050129"));
        users.put("Bob", new Player("Bob", "12524525"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER YOUR NAME: ");
        String username = scanner.nextLine();
        System.out.print("enter your password: ");
        String password = scanner.nextLine();

        if (username.equals("EasterEgg") && password.equals(":)")) {
            System.out.println("Congratulations！you find the EasterEgg");
            
            return true;
        } else if (users.containsKey(username) && users.get(username).getPassword().equals(password)) {
            System.out.println(":) welcome");
            return true;
        } else {
            System.out.println(":( your password is wrong, try again");
            return false;
        }
    }
}


