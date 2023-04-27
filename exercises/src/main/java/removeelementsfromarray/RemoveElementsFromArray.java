package removeelementsfromarray;

public class RemoveElementsFromArray {
    public static Object[] removeElementsFromArray(Object[] array) {
        int n = array.length;
        if (n <= 1) {
            return array;
        }
        // n -> (n / 2) + n % 2
        Object[] result = new Object[(n / 2) + n % 2];
        for (int i = 0; i < n; i = i + 2) {
            result[i / 2] = array[i];
        }
        return result;
    }
}
