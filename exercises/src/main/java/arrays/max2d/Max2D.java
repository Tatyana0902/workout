package arrays.max2d;

public class Max2D {
    public static int[] max2d(int[][] array) {
//        int[][] array = {
//                {1,3,5,7,9,11,13,15},
//                {-1,0,1,2,3,4,5,6},
//                {-10,-5,0,5,10,15,20,25},
//                {2,4,6,8,10,12,14,16},
//                {3,5,1,2,6,9,8,7}
//        };
        int[] max = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            max[i] = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (max[i] < array[i][j]) {
                    max[i] = array[i][j];
                }
            }
        }
        return max;
    }
}
