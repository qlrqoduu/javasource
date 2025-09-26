package basic;

import java.util.Scanner;

public class BreakExx21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. menu");
            System.out.println("2. me");
            System.out.println("3. men");
            System.out.println("원하는 메뉴를 선택해주세요.");

            int a = Integer.parseInt(sc.nextLine());

            System.out.printf("선택한 메뉴는 %d입니다.\n", a);

            if (a == 0) {
                System.out.println("프로그램 종료");
                break;

            } else if (a != 1 || a != 2 || a != 3) {
                System.out.println("선택한 메뉴는 없습니다 다시 입력");
                continue;
            }

        }

    }
}
