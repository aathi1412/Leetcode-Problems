
import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {-99,5,0,-3,4,0,-1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    } 
    
    public static void sort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else break;
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
