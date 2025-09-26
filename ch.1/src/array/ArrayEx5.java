package array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 10개의 정수를 담는 배열 선언 0~9사이의 숫자로 초기화

        int hee[] = new int[10];
        int a = 0;
        int y;

        for (int i = 0; i < hee.length; i++) {
            hee[i] = a;
            a++;
        }

        for (int i = 0; i < 100; i++) {
            int ran = (int) (Math.random() * 9 + 1);
            y = hee[ran];
            hee[ran] = hee[9 - ran];
            hee[9 - ran] = y;

        }
        System.out.println(Arrays.toString(hee));

    }
}
