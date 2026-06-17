
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    } 
    
    public static void sort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            while(arr[i] - 1 != i){
                swap(arr, i, arr[i] - 1);
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
