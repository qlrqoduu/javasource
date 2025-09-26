package array;

import java.util.Arrays;

public class ArrayEx6 {
    public static void main(String[] args) {
        int a[] = new int[45];
        int y = 1;

        for (int i = 0; i < a.length; i++) {
            a[i] = y;
            y++;
        }

        for (int i = 0; i < 6; i++) {
            int b = (int) (Math.random() * 10 + 35);
            if (b != i) {
                int c = a[i];
                a[i] = a[b];
                a[b] = c;

            }

        }
        System.out.println(Arrays.toString(a));

    }
}
