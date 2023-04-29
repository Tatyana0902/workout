package feast;

public class Feast {
    public static boolean feast(String animals, String food) {
        int a = animals.length();
        int f = food.length();
        //noinspection RedundantIfStatement
        if ((animals.charAt(0) == food.charAt(0)) && (animals.charAt(a - 1) == food.charAt(f - 1))) {
            return true;
        } else {
            return false;
        }
    }
}
