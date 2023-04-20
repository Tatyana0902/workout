package modulnamber;

public class ModuleNumber {
    public static double moduleNumber(double a, double b, double c) {
        double d;
        if (Math.abs(a) < Math.abs(b)) {
            if (Math.abs(a) < Math.abs(c)) {
                d = a;
            } else {
                d = c;
            }
        } else {
            if (Math.abs(b) < Math.abs(c)) {
                d = b;
            } else {
                d = c;
            }
        }
        return d;
    }
}
