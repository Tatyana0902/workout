package task1;
import java.util.Scanner;

public class Internet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        if (D <= B){
            System.out.print(A);
        }else{
            System.out.print(A + C * (D - B));
        }
    }
}
