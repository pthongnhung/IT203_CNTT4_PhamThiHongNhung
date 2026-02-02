package session07.lesson6;

import java.util.ArrayList;

public class UserManager {

    // ===== Static List: Database giả lập =====
    public static ArrayList<User> users = new ArrayList<>();

    // ===== Thêm user =====
    public static void addUser(User u) {
        users.add(u);
    }

    // ===== Kiểm tra đăng nhập =====
    public static boolean checkLogin(String username, String password) {
        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                return true; // đăng nhập thành công
            }
        }
        return false; // thất bại
    }

    // ===== Hiển thị danh sách user =====
    public static void showAllUsers() {
        int index = 1;
        for (User u : users) {
            System.out.println(index + ". " + u.toString());
            index++;
        }
    }
}

