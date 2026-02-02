package session07.lesson1;

public class Main {
    public static void main(String[] args) {
        Student sv1 = new Student(1,"Pham Thi Hong Nhung");
        Student sv2 = new Student(2,"Nguyen Van Anh");
        Student sv3 = new Student(3,"Hong Nhung Pham");

        sv1.display();;
        sv2.display();
        sv3.display();

        Student.showTotalStudent();
    }
}
