package averagevalue;

public class AverageValue {
    public static double averageValue(double[] args) {
        double result = 0;
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < args.length; i++) {
            result = result + args[i];

        }
        return result / args.length;
    }
}
