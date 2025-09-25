package control;

import java.util.Scanner;

public class ExamEx3 {
    public static void main(String[] args) {

        // 하루 일당, 8시간까지 10030, 8시간 이후에는 1.5배, 하

        Scanner sc = new Scanner(System.in);

        System.out.println("오늘 일한 시간을 입력해주세요 : ");
        int wt = Integer.parseInt(sc.nextLine());

        int fee;
        int rate = 10030;

        if (wt > 8) {
            fee = (int) (rate * 8 + ((rate * (wt - 8)) * 1.5));
            System.out.printf("오늘 일당은 %d원입니다.", fee);

        } else {
            fee = rate * wt;
            System.out.printf("오늘 일당은 %d원입니다.", fee);
        }

    }
}
