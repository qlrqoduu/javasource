package basic;

import java.util.Scanner;

public class ExamEx5 {
    public static void main(String[] args) {
        // 주사위 두개 던질거양 그래서 합이 5인 경우 주사위 그만 던지기

        int count = 1;

        while (true) {

            int a = (int) (Math.random() * 6 + 1);
            System.out.printf("첫번째 주사위 : %d\n ", a);
            System.out.println();

            int b = (int) (Math.random() * 6 + 1);
            System.out.printf("두번째 주사위 : %d\n", b);
            System.out.println();

            int c = a + b;

            System.out.printf("나온 주사위의 합은 %d입니다.", c);

            if (a + b != 5) {
                System.out.println("*****다시 진행합니다.******");
                System.out.println();
                count++;
                continue;

            } else {
                System.out.printf("5를 맞췄습니다. %d번만에 맞추셨습니다.", count);
                break;
            }

        }

    }
}
