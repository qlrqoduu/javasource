package basic;

import java.sql.Savepoint;
import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        // 사용자한테 숫자 받고 합계 , 0 입력 시 종료

        int sum = 0;

        Scanner sc = new Scanner(System.in);
        boolean in = true;

        while (in) {
            System.out.println("숫자를 입력하세요 : ");
            int a = Integer.parseInt(sc.nextLine());
            sum += a;

            if (a == 0) {
                in = false;

            }

        }
        System.out.printf("합계는 %d입니다.", sum);

    };
}
