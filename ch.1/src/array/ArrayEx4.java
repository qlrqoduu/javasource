package array;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] score = { 78, 55, 46, 49, 100, 97 };

        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];

            }

        }
        for (int i = 1; i < score.length; i++) {
            if (min > score[i]) {
                min = score[i];

            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}
