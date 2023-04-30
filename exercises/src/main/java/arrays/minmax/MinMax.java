package arrays.minmax;

public class MinMax {
    /**
     * @param array 2-dimension array to find min and max
     * @return 2-dimension array. Each string of which contains 2 elements: 0th element is min and 1st element is max,
     * i.e. i-th string of the returned array is a 1-dimension {min_i, max_i}
     */
    public static int[][] minMax(int[][] array) {
        int[][] minMax = new int[array.length][]; // [null, null, ..., null]
        for (int i = 0; i < array.length; i++) {
            int min = array[i][0];
            int max = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            minMax[i] = new int[] {min, max};
        }
        return minMax;
    }
}
