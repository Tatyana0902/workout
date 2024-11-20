package totalInArray;

public class TotalInArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 5,6,7,8,9};
        int[] array2 = {3, 3, 4,7,9};
        int[] array3 = {2, 3, 4, 5, 6,9};
        int i = 0;
        int j = 0;
        int k = 0;
        while (i <= array1.length - 1 && j <= array2.length - 1 && k <= array3.length - 1) { // !
            if (array1[i] == array2[j]) {
                int c = array1[i];
                if (c == array3[k]) {
                    System.out.println(c);
                }
                if (c > array3[k]) {
                    k++;
                } else {
                    i++;
                    j++;
                }
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}
