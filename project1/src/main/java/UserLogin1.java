import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.awt.Color;
public class UserLogin1 {
    private static HashMap<String, Player> users = new HashMap<>();
    public boolean login()//https://www.bilibili.com/video/BV1dj411r7dt/?spm_id_from=333.337.search-card.all.click
    {
        users.put("Dave", new Player("Dave", "dave1234"));
        users.put("Vincent", new Player("Vincent", "050129"));
        users.put("Bob", new Player("Bob", "12524525"));
        users.put("1", new Player("1", "1"));//set to make it easier for me to chick

        System.out.print("\033[1;31m");//https://blog.csdn.net/u014470361/article/details/81512330  change color
        System.out.print("___       ________________ _____________________  _________________\n" +
                "__ |     / /__  ____/__  / __  ____/_  __ \\__   |/  /__  ____/__  /\n" +
                "__ | /| / /__  __/  __  /  _  /    _  / / /_  /|_/ /__  __/  __  / \n" +
                "__ |/ |/ / _  /___  _  /___/ /___  / /_/ /_  /  / / _  /___   /_/  \n" +
                "____/|__/  /_____/  /_____/\\____/  \\____/ /_/  /_/  /_____/  (_) :)   \n");//ASCII
        System.out.print("\033[0m");
        Scanner scanner = new Scanner(System.in);
        String username = "";
        String password = "";
        boolean loggedIn = false;

        while (!loggedIn)//如果输入错误会返回输入界面。直至输入正确
        {
            System.out.print("ENTER YOUR NAME: ");
            username = scanner.nextLine();
            System.out.print("enter your password: ");
            password = scanner.nextLine();

            if (username.equals("EasterEgg") && password.equals(":)")) //EasterEgg!!!
            {
                System.out.println("Congratulations！you find the EasterEgg!");
                System.out.println("--Yu Bonan");
                System.out.print("\033[1;34m");
                System.out.println("__     _____ _   _  ____ _____ _   _ _____  __   ___   _ \n" +
                        "\\ \\   / /_ _| \\ | |/ ___| ____| \\ | |_   _| \\ \\ / / | | |\n" +
                        " \\ \\ / / | ||  \\| | |   |  _| |  \\| | | |    \\ V /| | | |\n" +
                        "  \\ V /  | || |\\  | |___| |___| |\\  | | |     | | | |_| |\n" +
                        "   \\_/  |___|_| \\_|\\____|_____|_| \\_| |_|     |_|  \\___/ ");////ASCII
                System.out.println(
                        "                                  *                                                  \n" +
                        "                                  @@@                                                \n" +
                        "                                  @@@@@=:                                            \n" +
                        "                       *       .@@@@@@@@@@@@%                                        \n" +
                        "                       @@%   -@@@@@@@@@@@@@@@@@                                      \n" +
                        "                        @@@@@@@@@@@@@@@@@@:  @@@                                     \n" +
                        "                       #@@=  %@@@@@@@@@@@@@%@@@+                                     \n" +
                        "                       @*      #@@@@@@@@@@@@@#                                       \n" +
                        "                                 :@@@@@@@#-                                          \n" +
                        "                                  @@@+                                               \n" +
                        "                                  @-                                                 \n");////ASCII
                System.out.print( "\033[0m");
                loggedIn = true;
            }
            else if (users.containsKey(username) && users.get(username).getPassword().equals(password)) //输入正确，继续下一步
            {
                System.out.println("Login successful!");
                loggedIn = true;
            }
            else//输入错误，返回
            {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        return true;

    }


}