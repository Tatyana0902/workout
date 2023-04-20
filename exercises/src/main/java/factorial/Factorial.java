package factorial;

/**
 * What is this class for? This class describes a Factorial
 */
public class Factorial {
    /**
     * What does this function do?function calculates a Factorial value for integer values
     *
     * @param n - what does it mean, which values does it accept? Variable n passed to factorial function and contains integer value
     * @return what it returns? function return result (integer value)
     * @exception IllegalArgumentException when is it thrown? IllegalArgumentException thrown when n < 0
     */
    public static int factorial(int n){
        if (n < 0) {
            throw new  IllegalArgumentException("n < 0");
        }
        if (n == 0){
            return 1;
        }
        int fn = 1;
        for (int i= 1; i <= n; i++) {
            fn = fn * i;

        }
        return fn;
    }
}
