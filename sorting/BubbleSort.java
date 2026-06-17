

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        sort(a, 0, 1);
        System.out.println(Arrays.toString(a));

    }

    static void sort(int[] a, int i, int j){
        if(i == a.length) return;

        if(j < a.length){
            if(a[j] < a[j-1]){
                swap(a, j-1, j);
            } 
            sort(a, i, j+1);
        }
        else{
            sort(a, i+1, 1);
        }
    }
    static void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
