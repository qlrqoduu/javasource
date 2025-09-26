package array;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };

        int soo[] = new int[8];

        // for (int i = 0; i < array.length; i++) {
        // soo[i] = array[i];

        // }
        // System.out.println(Arrays.toString(soo));

        System.arraycopy(array, 0, soo, 0, 5);

        // int a = 1;

        // for (int i = 5; i < soo.length; i++) {
        // soo[i] = a;
        // a++;

        // }
        System.out.println(Arrays.toString(soo));

    }
}
