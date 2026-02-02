package session07.lesson5;

public class Main {
    public static void main(String[] args) {

        double score1 = 8.5;
        double score2 = -2.0;
        double score3 = 11.0;

        checkScore(score1);
        checkScore(score2);
        checkScore(score3);

        // Config.MAX_SCORE = 20.0;   // ERROR: cannot assign a value to final variable
    }

    public static void checkScore(double score) {
        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ: " + score);
        } else {
            System.out.println("Điểm KHÔNG hợp lệ: " + score);
        }
    }
}
