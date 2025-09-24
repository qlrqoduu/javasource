package basic;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        // 키보드에서 입력받기

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자입력 : ");
        int input1 = Integer.parseInt(sc.nextLine());
        // float input1 = Float.parseFloat(sc.nextline());

        System.out.print("연산자 입력 : ");
        String p = sc.nextLine();

        System.out.print("두번째 숫자입력 : ");
        int input2 = Integer.parseInt(sc.nextLine());

        System.out.println(input1 + input2);
        System.out.printf("%d %s %d = %d", input1, p, input2, input1 + input2);
        sc.close();

    }
}
