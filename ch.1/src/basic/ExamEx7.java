package basic;

import java.util.Scanner;

public class ExamEx7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int d = 80000;
        boolean x = true;

        while (x) {

            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");

            System.out.print("선택 : ");
            int a = Integer.parseInt(sc.nextLine());

            switch (a) {
                case 1:
                    System.out.print("입금액 : ");
                    int b = Integer.parseInt(sc.nextLine());
                    d += b;

                    if (b > 100000) {
                        System.out.println("로또라도 맞았나보네요");

                    }

                    continue;
                case 2:
                    System.out.print("출금액 : ");
                    int c = Integer.parseInt(sc.nextLine());
                    d -= c;

                    continue;
                case 3:
                    System.out.printf("잔고 : %d\n ", d);

                    continue;
                case 4:
                    System.out.println("종료");
                    x = false;

                default:
                    break;

            }

        }

    }
}
