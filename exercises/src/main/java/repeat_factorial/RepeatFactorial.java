package repeat_factorial;

public class RepeatFactorial {
    public static int repeatFactorial(int n){
        if (n == 0){
            return 1;
        }
        if (n == 1) {
            return 1;
        }
            int result = repeatFactorial(n - 1) * n;
            return result;


    }
}
