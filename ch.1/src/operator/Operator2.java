package operator;

public class Operator2 {

    public static void main(String[] args) {
        int a = 10, b = 4;

        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b);
        System.out.printf("%d %% %d = %d\n", a, b, a % b);
        System.out.printf("%d / %.2f = %.2f\n", a, (float) b, a / (float) b);

        char c1 = 'a', c2 = c1, c3 = ' ';

        int h = c1 + 1;
        System.out.printf("%c%c", c1, 1);

        for (char j = 'a'; j <= 'z'; j++) {
            System.out.println(j + " ");

        }
    }
}
