package basic;

import java.util.Scanner;

public class Dooooo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = (int) (Math.random() * 100);
        System.out.println(answer);

        int count = 0;

        int num;
        do {
            System.out.println("1~100 사이의 숫자를 입력해보는 양희원배 퀴즈~!입니다. 입력해주세요 : ");

            num = Integer.parseInt(sc.nextLine());

            if (num > answer) {

                if (num - answer <= 10) {
                    System.out.println("조금 커용 아쉬워요!");

                } else {
                    System.out.println("너무 큽니다.");
                }

            } else if (num < answer) {

                if (answer - num <= 10) {
                    System.out.println("조금 작네용 조금 더 노력!");

                } else {
                    System.out.println("너무 작습니다.");
                }
            } else {
                System.out.println("정답");
            }
            count++;

        } while (answer != num);

    }
}
