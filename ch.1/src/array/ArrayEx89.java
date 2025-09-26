package array;

public class ArrayEx89 {
    public static void main(String[] args) {

        int jumsu[][] = {
                { 100, 95, 20 },
                { 80, 100, 70 },
                { 100, 60, 84 },
                { 70, 90, 95 },
                { 10, 5, 11 }
        };

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("============================");

        for (int i = 0; i < jumsu.length; i++) {
            System.out.printf("%3d", i + 1);
            int sum = 0;

            for (int j = 0; j < jumsu[i].length; j++) {
                System.out.printf("%5d", jumsu[i][j]);
                sum += jumsu[i][j];

            }
            System.out.printf("%5d", sum);
            System.out.printf("%5.1f", (float) (sum / 3));

            System.out.println("\t");
        }
        System.out.println("============================");
        System.out.println("총점 : %d, 국어 총점 : %d, 영어 총점 : %d, 수학 총점 : %d");

    }
}
