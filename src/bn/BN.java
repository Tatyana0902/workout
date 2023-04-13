package bn;

public class BN {
    public static void main(String[] args) {
        int b1 = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        System.out.println(bnGeometric(b1, q, n));
    }

    public static int bnGeometric(int b1, int q, int n) {
        int bn = b1;
        for (int i = 0; i < n - 1; i++) {
            bn = bn * q;
        }
        return bn;
    }
}
