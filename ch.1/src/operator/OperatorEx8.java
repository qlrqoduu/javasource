package operator;

import java.util.Scanner;

public class OperatorEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int input = sc.nextInt();
        String y = input % 2 == 0 ? "짝수" : "홀수";
        System.out.println(y);

    }
}
