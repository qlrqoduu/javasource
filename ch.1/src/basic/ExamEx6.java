package basic;

public class ExamEx6 {
    public static void main(String[] args) {
        // 중첩 for 방정식 4x + 5y = 60의 모든 해를 구해서 (x,y)형태로 출력

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (4 * i + 5 * j == 60) {
                    System.out.printf("(%d, %d)\n", i, j);

                }

            // 그런건없어? 정처기 실기 이론 정리 집이라든지 

        }
    }
}
