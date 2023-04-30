package arrays.sort;

public class Sort {
    public static void sort(int[] arr) {
        if (arr.length <= 1) {
            return ;
        }
        for (int k = 0; k < arr.length; k++) {
            for (int i = k + 1; i < arr.length; i++) {
                if (arr[i] < arr[k]) {
                    int min = arr[i];
                    arr[i] = arr[k];
                    arr[k] = min;
                }
            }
        }
    }
}
