package fib;

public class Fib {
    public static int[] fib (int n){
        if (n == 0){
            return new int[]{};
        }
        if (n == 1){
            return new int[]{1};
        }
       int [] fb = new int[n];
       fb[0]=1;
       fb[1]=1;
       for (int i =2; i< n ;i++){
           fb[i] = fb[i-1]+fb[i-2];
       }
       return fb;

    }
}
