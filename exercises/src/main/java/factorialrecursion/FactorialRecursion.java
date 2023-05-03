package factorialrecursion;

public class FactorialRecursion {
    public static int fact (int n){
        if(n<=1){
            return 1;
        }
        int result = fact(n - 1) * n;
        return result;
    }
}
