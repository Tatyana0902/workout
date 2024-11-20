package factorial;

public class Factorial {
    public static int fact(int n){
        int factorial;
        if (n == 0){
            return 1;
        }
        else
       factorial = n * fact(n - 1);
        return factorial;
    }
}
