package control;

import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        int a = 0;
        String b = " ";

        for (int i = 0; i < 10; i++) {
            if (i > a) {
                b += "*";
                System.out.println(b);

            }

        }

    }

}