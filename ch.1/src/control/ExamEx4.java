package control;

import java.util.Scanner;

public class ExamEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자 : ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.println("연산자 : ");
        String b = sc.nextLine();

        System.out.println("두번째 숫자 : ");
        int c = Integer.parseInt(sc.nextLine());

        switch (b) {
            case "+":
                System.out.printf("%d %s %d = %d", a, b, c, a + c);
                break;

            case "-":
                System.out.printf("%d %s %d = %d", a, b, c, a - c);
                break;

            case "*":
                System.out.printf("%d %s %d = %d", a, b, c, a * c);
                break;

            case "/":
                System.out.printf("%d %s %d = %d", a, b, c, a / c);

            default:
                break;
        }

    }
}
