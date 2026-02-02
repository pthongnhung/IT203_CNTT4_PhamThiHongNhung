package session07.lesson4;

public class ClassRoom {

    // ===== Static variable (quỹ lớp - của chung) =====
    private static double classFund = 0;

    // ===== Instance variable (riêng từng sinh viên) =====
    private String studentName;

    // ===== Constructor =====
    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    // ===== Phương thức đóng tiền vào quỹ =====
    public void payFund(double amount) {
        if (amount > 0) {
            classFund += amount;
            System.out.println(studentName + " đã đóng: " + amount + "đ");
        } else {
            System.out.println("Số tiền không hợp lệ!");
        }
    }

    // ===== Xem tổng quỹ lớp =====
    public static void showClassFund() {
        System.out.println("👉 Tổng quỹ lớp hiện tại: " + classFund + "đ");
    }

    // ===== Hiển thị tên sinh viên =====
    public void display() {
        System.out.println("Sinh viên: " + studentName);
    }
}
