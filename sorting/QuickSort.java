
import java.util.Arrays;

public class QuickSort{
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void sort (int[] a, int low, int high){
        if(low >= high) return;

        int s = low, e = high;
        int m = s + (e - s) / 2;
        int pivot = a[m];

        while(s <= e){
            while(a[s] < pivot) s++;
            while(a[e] > pivot) e--;
            
            if(s <= e){
                int t = a[s];
                a[s] = a[e];
                a[e] = t;

                s++; e--;
            }
        }

        sort(a, low, e);
        sort(a, s, high);
    }
}