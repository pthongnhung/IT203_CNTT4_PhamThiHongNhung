package session07.lesson1;

public class Student {
    private int studentId;
    private static String studentName;
    private static int totalStudent=0;

    public Student(int studentId, String studentName) {
        this.studentId=studentId;
        this.studentName=studentName;
        this.totalStudent=totalStudent;
        totalStudent++;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public static String getStudentName() {
        return studentName;
    }

    public static void setStudentName(String studentName) {
        Student.studentName = studentName;
    }

    public static int getTotalStudent() {
        return totalStudent;
    }

    public static void setTotalStudent(int totalStudent) {
        Student.totalStudent = totalStudent;
    }

    public void display(){
        System.out.println("Ma sv "+studentId+  " -Ten sinh vien "+studentName);
    }

    public static void showTotalStudent(){
        System.out.println("Tong so sinh vien: "+totalStudent);
    }
}

