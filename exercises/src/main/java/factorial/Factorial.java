package factorial;

/**
 * This class calculates the Factorial funcation.
 */
public class Factorial {
    /**
     * Calculates the Factorial function.
     *
     * @param n - argument of the Factorial function
     * @return Factorial value
     * @throws IllegalArgumentException thrown when n < 0
     */
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        if (n == 0) {
            return 1;
        }
        int fn = 1;
        for (int i = 1; i <= n; i++) {
            fn = fn * i;

        }
        return fn;
    }
}
