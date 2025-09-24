package operator;

import java.util.Scanner;

public class OperatorEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int input = sc.nextInt();
        String y = input > 0 ? "양수" : (input == 0 ? "0" : "음수");
        System.out.println(y);

    }
}
