import java.util.HashMap;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        // 创建一个存储用户名和密码的HashMap
        HashMap<String, String> users = new HashMap<>();
        //I learn this from Bilibili,which is just like Youtube.
        users.put("Dave", "dave1234");
        users.put("Vincent", "050129");
        users.put("Bob", "12524525");
        users.put("EasterEgg", ":)");
        System.out.println(" @ \\-------------------, \n" +
                " \\_,|                  | \n" +
                "    |     WELCOME      |\n" +
                "    |  ,----------------,\n" +
                "    \\_/________________/ ");

        // 获取用户输入的用户名和密码
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER YOUR NAME: ");
        String username = scanner.nextLine();
        System.out.print("enter your password: ");
        String password = scanner.nextLine();

        // 检查用户名和密码是否匹配
            if (users.containsKey(username) && users.get(username).equals(password)) {
                System.out.println(":)" +
                        "welcome");
            } else {
                System.out.println(":(  " +
                        "your password is wrong,try again");
            }

    }
}

