package basic;

import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
        // 숫자를 입력받아 각 자리의 합을 구하기

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요 : ");

        int a = Integer.parseInt(sc.nextLine());

        int sum = 0;

        while (a % 10 != 0) {
            int b = a % 10;
            sum += b;
            a = a / 10;

        }
        System.out.println("각 자릿수 합은 : " + sum);

    }
}
