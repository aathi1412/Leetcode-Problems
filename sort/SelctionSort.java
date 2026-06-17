package Arrays.sort;

import java.util.Arrays;

public class SelctionSort {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        sort2(a, a.length, 0, 0);
        System.out.println(Arrays.toString(a));
    }
    static void sort1(int[] a, int i){
        if(i == a.length) return;

        int max = 0, idx = 0;
        for(int k = 0; k < a.length - i; k++){
            if(max < a[k]){
                max = a[k];
                idx = k;
            }
        }
        swap(a, idx, a.length - 1 - i);
        sort1(a, i+1);
    }

    static void sort2(int[] a, int r, int c, int max){
        if(r == 0) return;

        if(c < r){
            if(a[c] > a[max]){
                sort2(a, r, c+1, c);
            }
            else sort2(a, r, c+1, max);
        }
        else{
            swap(a, r-1, max);
            sort2(a, r-1, 0, 0);
        }
    }

    static void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
