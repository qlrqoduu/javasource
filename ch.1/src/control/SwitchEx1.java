package control;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("월을 입력해주세요 : ");

        int month = Integer.parseInt(sc.nextLine());

        switch (month) {
            case 3, 4, 5:
                System.out.println("봄 산뜻하죵?");
                break;
            case 6, 7, 8:
                System.out.println("여름 아따 덥죠잉");
                break;
            case 9, 10, 11:
                System.out.println("가을 남자~");
                break;
            case 12, 1, 2:
                System.out.println("겨울에는 호빵이 제격!");

            default:
                break;
        }
    }
}
