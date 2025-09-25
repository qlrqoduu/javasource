package basic;

public class ForEx3 {
    public static void main(String[] args) {

        // for문 구구단

        for (int i = 1; i < 10; i++) {
            System.out.println();
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d단 : %d * %d = %d\n", i, i, j, i * j);

            }

        }
        // while문 구구단

        int i = 1;
        int j = 1;

        while (i < 10) {
            j = 1;

            while (j < 10) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
                j++;

            }
            i++;

        }

    }
}
