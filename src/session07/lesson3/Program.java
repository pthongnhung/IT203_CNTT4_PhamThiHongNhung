package session07.lesson3;

public class Program {
    public static void main(String[] args) {

        // Danh sách điểm mẫu
        double[] scores = {6.5, 8.0, 4.5};

        // Tính điểm trung bình (gọi static qua tên lớp)
        double avg = ScoreUtils.calculateAverage(scores);

        System.out.println("Điểm trung bình: " + avg);

        System.out.println("Kết quả từng môn:");

        // Kiểm tra từng điểm
        for (double s : scores) {
            boolean pass = ScoreUtils.checkPass(s);

            if (pass) {
                System.out.println("Điểm " + s + " -> ĐẠT");
            } else {
                System.out.println("Điểm " + s + " -> TRƯỢT");
            }
        }
    }
}

