package factorial2;

public class Factorial {
    public static int fact (int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        int fn = 1;
        for (int i = 1; i <= n; i++) {
            fn = fn * i;
        }
        return fn;

    }
}
