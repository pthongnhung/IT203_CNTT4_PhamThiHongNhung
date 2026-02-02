package session07.lesson2;

public class Main {
    public static void main(String[] args) {

        // ===== PRIMITIVE =====
        int a = 10;     // biến nguyên thủy
        int b = a;      // sao chép giá trị

        System.out.println("PRIMITIVE:");
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 10

        b = 20; // thay đổi b

        System.out.println("Sau khi đổi b:");
        System.out.println("a = " + a); // 10 (không đổi)
        System.out.println("b = " + b); // 20

        System.out.println("----------------------");

        // ===== REFERENCE =====
        Student s1 = new Student("An"); // object trong Heap
        Student s2 = s1;                // sao chép địa chỉ tham chiếu

        System.out.println("REFERENCE:");
        System.out.println("s1.name = " + s1.name); // An
        System.out.println("s2.name = " + s2.name); // An

        // Thay đổi qua s2
        s2.name = "Binh";

        System.out.println("Sau khi đổi s2.name:");
        System.out.println("s1.name = " + s1.name); // Binh
        System.out.println("s2.name = " + s2.name); // Binh
    }
}
