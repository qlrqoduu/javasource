package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArratEx2 {
    public static void main(String[] args) {
        String arr[] = new String[4];

        for (int i = 0; i < 4; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println("먹고싶은 과일 4개 : ");
            String a = sc.nextLine();

            arr[i] = a;

        }
        System.out.println(Arrays.toString(arr));

        for (String str : arr) {
            System.out.println(str);

        }
    }

}
