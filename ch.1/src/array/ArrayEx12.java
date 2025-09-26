package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx12 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("점수를 입력하세요 : ");
            int a = Integer.parseInt(sc.nextLine());

            arr[i] = a;
            sum += a;

        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("총합 : %d", sum);

    }
}
