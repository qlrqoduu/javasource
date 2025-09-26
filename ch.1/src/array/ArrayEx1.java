package array;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int a = 0;

        for (int i = 0; i < 60; i++) {

            if (i % 3 == 0) {
                arr[a] = i;
                a++;
                if (a == 10) {
                    break;

                }

            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
