package basic;

public class BreakEx1 {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        while (sum < 100) {
            sum += i;
            i++;

        }
        System.out.println(sum);
    }
}
