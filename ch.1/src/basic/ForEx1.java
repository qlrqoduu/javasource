package basic;

public class ForEx1 {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 3 };
        int a = 0;

        for (int i = 0; i < 4; i++) {
            if (arr[i] > arr[i + 1]) {
                a = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = a;

            } else {
                --i;
            }

        }
        System.out.println(arr);

    }
}
