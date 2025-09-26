package basic;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 하나 입력해주세요 : ");

        int num = Integer.parseInt(sc.nextLine());
        String s = " ";

        for (int i = 1; i <= num; i++) {
            s += "*";
            System.out.printf("%" + num + "s\n", s);

        }

    }
}
