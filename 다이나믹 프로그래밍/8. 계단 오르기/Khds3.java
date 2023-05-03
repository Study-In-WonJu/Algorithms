import java.util.Scanner;

public class Khds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result;
        int n = sc.nextInt();
        int[] score = new int[n];
        int[] totalScore = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        totalScore[0] = score[0];
        for (int i = 1; i < n; i++) {
            if (i == 1) {
                totalScore[i] = score[i] + score[i - 1];
                continue;
            }
            if (i == 2) {
                totalScore[i] = score[i] + Math.max(score[i - 1], score[i - 2]);
                continue;
            }
            totalScore[i] =
                    score[i] + Math.max(score[i - 1] + totalScore[i - 3], totalScore[i - 2]);
        }
        result = totalScore[n - 1];
        System.out.println(result);
    }
}