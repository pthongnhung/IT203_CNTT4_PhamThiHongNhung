package session07.lesson6;

public class User {

    // ===== Thuộc tính =====
    public final int id;        // ID bất biến (final)
    public String username;
    public String password;

    // ===== Constructor =====
    public User(int id, String username, String password) {
        this.id = id;                 // bắt buộc gán trong constructor
        this.username = username;
        this.password = password;
    }

    // ===== toString() =====
    @Override
    public String toString() {
        return "User[id=" + id + ", name=" + username + "]";
    }
}

