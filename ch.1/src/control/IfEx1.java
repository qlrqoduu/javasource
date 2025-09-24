package control;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("점수입력 : ");

        int jumsu = Integer.parseInt(sc.nextLine());

        if (jumsu >= 60) {
            System.out.println("합격");

        } else {
            System.out.println("불합격");
        }

        System.out.println(jumsu >= 60 ? "합격" : "블합격");

    }
}
