package pramudito.rh.util;

public class MathUtil {
    public static int sum(int... values) {
        int total = 0;
        for (int value: values) {
            total += value;
        }
        return total;
    }
}
