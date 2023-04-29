package arrayindex;

public class ArrayIndex {
    public static int[] arrayIndex(int[] array, int number) {
        int c = 0;
        //noinspection ForLoopReplaceableByForEach
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                c++;
            }
        }
        int[] list = new int[c];
        int k = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == number) {
                list[k] = j;
                k++;
            }
        }
        return list;
    }
}

