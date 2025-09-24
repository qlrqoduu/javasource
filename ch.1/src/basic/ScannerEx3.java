package basic;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        // 키보드에서 입력받기

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자입력 : ");
        int num1 = sc.nextInt();
        System.out.println("연산자 입력 : ");
        String p = sc.nextLine();
        System.out.print("두번째 숫자입력 : ");
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);
        System.out.printf("%d %c %d = %d", num1, p, num2, num1 + num2);
        sc.close();

    }
}
