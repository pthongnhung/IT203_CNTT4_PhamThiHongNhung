package session07.lesson4;

public class Main {
    public static void main(String[] args) {

        // Tạo nhiều sinh viên
        ClassRoom s1 = new ClassRoom("An");
        ClassRoom s2 = new ClassRoom("Binh");
        ClassRoom s3 = new ClassRoom("Chi");

        // Mỗi sinh viên đóng tiền
        s1.payFund(10000);
        s2.payFund(20000);
        s3.payFund(15000);

        // Xem tổng quỹ lớp
        ClassRoom.showClassFund();
    }
}
