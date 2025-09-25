package control;

import java.util.Scanner;

public class ExamEx2 {
    public static void main(String[] args) {
        // 3개의 정수를 입력받아 가장 작은 값 추출

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요 : ");
        int a1 = Integer.parseInt(sc.nextLine());

        System.out.println("숫자를 입력해주세요 : ");
        int a2 = Integer.parseInt(sc.nextLine());

        System.out.println("숫자를 입력해주세요 : ");
        int a3 = Integer.parseInt(sc.nextLine());

        int max = a1;

        if (max < a2) {
            max = a2;
            if (max < a3) {
                max = a3;

            }

        }
        System.out.printf("최댓값은 %d입니다.", max);

        // if (a1 - a2 < 0 && a1 - a3 < 0) {
        // System.out.printf("가장 작은 값은 %d 입니다. ", a1);

        // } else if (a2 - a1 < 0 && a2 - a3 < 0) {
        // System.out.printf("가장 작은 값은 %d 입니다. ", a2);

        // } else if (a3 - a1 < 0 && a3 - a2 < 0) {
        // System.out.printf("가장 작은 값은 %d 입니다. ", a3);

        // }

    }
}
