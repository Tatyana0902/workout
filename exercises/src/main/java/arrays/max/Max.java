package arrays.max;

public class Max {
    public static int max(int[] a){
        int max;
        //int[] a ={1,3,2,7,5,4};
        max = a[0];
        for(int i = 1; i< a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
}
