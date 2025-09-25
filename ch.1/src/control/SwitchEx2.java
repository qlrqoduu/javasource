package control;

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        System.out.print("숫자 중 하나를 입력하세요: ");

        Scanner sc = new Scanner(System.in);
        int user = Integer.parseInt(sc.nextLine());

        int com = (int) (Math.random() * 3) + 1;
        System.out.println(com);

        if (user > com) {
            System.out.println("당신의 승리입니다.");

        } else if (user == com) {
            System.out.println("비겼습니다.");

        } else if (user < com) {
            System.out.println("졌대요 멍충 ㅋ");

        }

    }
}
