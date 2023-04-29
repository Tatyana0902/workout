package fib;

public class Fib {
    public static int[] fib(int n) {
        if (n == 0) {
            return new int[]{};
        }
        if (n == 1) {
            return new int[]{0};
        }
        // n >= 2
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; i++) {
            f[i] = f[i - 2] + f[i - 1];
        }
        return f;
    }
}
