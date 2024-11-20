package bubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                System.out.printf("a[%d] = %d, a[%d] = %d\n", i, a[i], j, a[j]);
                if (a[i] > a[j]) {
                    int c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
            System.out.println(Arrays.toString(a));
        }
        return a;
    }

}
