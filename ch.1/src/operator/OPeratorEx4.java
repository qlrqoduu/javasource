package operator;

public class OPeratorEx4 {
    public static void main(String[] args) {
        // 논리 연산자
        int x = 12;

        System.out.println(x > 10 && x < 20);

        int i = 7;
        boolean y = i % 2 == 0 || i % 3 == 0;
        System.out.println(y);
        System.out.println(!y);

    }
}
