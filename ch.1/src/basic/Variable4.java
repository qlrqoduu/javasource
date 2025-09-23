package basic;

public class Variable4 {
    public static void main(String[] args) {
        boolean a = true;

        System.out.println(a ? "참" : "거짓");

        char ch = 'a';
        char ch2 = '가';

        System.out.println("ch = " + ch + " ch2 = " + ch2);
        System.out.printf("ch =  %c ,  ch2 = %c\n", ch, ch2);
        System.out.printf("ch2 = %c\n", (ch2 + 1));
        System.out.printf("ch2 = %d\n", (ch2 + 1));

        String hey = "집 떠나";
        String hii = "열차 타고";

        System.out.println(hey + "  " + hii + " 여행 가는 길 ~ 룰루랄라");

    }
}
