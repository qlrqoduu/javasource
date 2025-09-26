package array;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        String[] strarr = { "yang", "hee", "won" };
        System.out.println(Arrays.toString(strarr));

        System.out.println(strarr[0]);
        System.out.println("strarr[0].charat(0)] : " + strarr[0].charAt(0));

        for (int i = 0; i < strarr[0].length(); i++) {
            System.out.printf("%d번째 글자는 : %s\n", i + 1, strarr[0].charAt(i));

        }

        char[] chArr = { 'A', 'B', 'C', 'D', 'E' };
        String str2 = new String(chArr);
        System.out.println(str2);

    }
}
