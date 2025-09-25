package basic;

import java.util.Scanner;

public class DowhileEx1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int answer = (int)(Math.random() * 100);
        
        int num;
        do {
            

        System.out.println("1~100 사이의 숫자를 입력 : ");

        num = Integer.parseInt(sc.nextLine());

        if (num > answer) {
                System.out.println("너무 큽니다.");
                
            }else{
                System.out.println("너무 작습니다.");
            }

        
            
        } while (answer != num;)
            
        };

};

}
