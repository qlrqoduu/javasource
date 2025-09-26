package array;

import java.util.Arrays;

public class ArrayEx8 {
    public static void main(String[] args) {
        int[][] score = new int[3][4];
        int a = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {
                score[i][j] = a;
                a++;

            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < score[i].length; j++) {

                System.out.printf("[%d]행 [%d]열은 = %d입니다.\t", i, j, score[i][j]);

            }
            System.out.println();

        }
    }
}
