package arrays.mirror;

public class Mirror {
    public static int[] mirror(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int[] a = new int[arr.length];
        for(int i = 0; i< arr.length;i++){
            a[i] = arr[arr.length- i-1];
        }
        return a;
    }
}
