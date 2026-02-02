package session07.lesson3;

public class ScoreUtils {

    // Kiểm tra đậu / rớt
    public static boolean checkPass(double score) {
        if (score >= 5.0) {
            return true;   // Đạt
        } else {
            return false;  // Trượt
        }
    }

    // Tính điểm trung bình
    public static double calculateAverage(double[] scores) {
        double sum = 0;

        for (double s : scores) {
            sum += s;
        }

        return sum / scores.length;
    }
}

