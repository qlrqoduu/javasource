package control;

import java.util.Scanner;

public class IfEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하세요 : ");
        int a = Integer.parseInt(sc.nextLine());

        char grade;

        if (a >= 90) {
            grade = 'A';

        } else if (a >= 80) {
            grade = 'B';

        } else if (a >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("등급 : " + grade);

    }

}
