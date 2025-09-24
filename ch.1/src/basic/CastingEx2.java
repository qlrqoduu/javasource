package basic;

public class CastingEx2 {
    public static void main(String[] args) {
        int i = 9123456;
        float f = i;
        int i2 = (int) f;

        double d = i;
        int i3 = (int) d;

        System.out.println(i3);
    }
}
