package arrays.binsearch;

public class BinSearch {
    public static int binSearch(int[] arr, int n) {
        if (arr.length == 0) {
            return -1;
        }
        return binSearchInternal(arr, n, 0, arr.length);
    }

    private static int binSearchInternal(int[] arr, int n, int from, int to) {
        int l = to - from;
        if (l == 1) {
            if (n == arr[from]) {
                return from;
            } else if (n < arr[from]) {
                return -from - 1;
            } else {
                return -to - 1;
            }
        }

        int middle = l / 2;
        if (n < arr[middle]) {
            return binSearchInternal(arr, n, from, middle);
        } else {
            return binSearchInternal(arr, n, middle, to);
        }
    }
}

