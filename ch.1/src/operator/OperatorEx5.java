package operator;

public class OperatorEx5 {
    public static void main(String[] args) {

        int x = 10, y = -5, z = 0;

        int b = x <= 0 ? x : -x;
        int c = y > 10 ? 2 * y : 10 * y;

        // System.out.println(b);
        // System.out.println(c);
        // System.out.printf("x의 결과는 : %d", b);

        char sign1, sign2, sign3;
        sign1 = x > 0 ? '+' : (x == 0 ? ' ' : '-');
        sign1 = y > 0 ? '+' : (y == 0 ? ' ' : '-');
        sign1 = z > 0 ? '+' : (z == 0 ? ' ' : '-');

        System.out.printf("x = %c%d\n", sign1, b);

    }
}
