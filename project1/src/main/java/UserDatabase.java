import java.util.HashMap;
import java.util.Map;

public class UserDatabase {
    private Map<String, String> users;

    public UserDatabase() {
        users = new HashMap<>();
        users.put("Dave", "dave1234");
        users.put("Vincent", "050129");
        users.put("1", "1");//测试用
    }

    public boolean addUser(String username, String password) {
        if (users.containsKey(username)) {
            return false; // 如果用户名已存在，则添加失败
        } else {
            users.put(username, password);
            return true; // 添加成功
        }
    }

    public boolean verifyUser(String username, String password) {
        if (users.containsKey(username) && users.get(username).equals(password)) {
            return true; // 用户名和密码匹配
        } else {
            return false; // 用户名或密码不正确
        }
    }
}
