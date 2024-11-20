package tinkoff.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        int c = 0;
        for (int i = l; i <= r; i++) {
            int d = countDivisors(i);
            if (d > 2) {
                if (isPrime(d)) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }

    private static boolean isPrime(int d) {
        return countDivisors(d) == 2;
    }

    public static int countDivisors(int num) {
        int count = 0;
        int limit = (int) Math.sqrt(num);

        for (int i = 1; i <= limit; i++) {
            if (num % i == 0) {
                count++;
                if (i != num / i) {
                    count++;
                }
            }
        }
        return count;
    }
}
