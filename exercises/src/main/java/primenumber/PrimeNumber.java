package primenumber;

public class PrimeNumber {
    public static boolean primeNumber(int n) {

        if (n == 1 | n == 2 | n == 3 | n == 5 | n == 7) {
            return true;
        }
        for(int i = 2; i < n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
