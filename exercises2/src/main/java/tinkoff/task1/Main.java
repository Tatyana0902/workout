package tinkoff.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if (d <= b) {
            System.out.println(a);
        } else {
            System.out.println(a + c * (d - b));
        }
    }
}
