
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {5,4,3,4,3,2,1,0};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    static void mergeSort(int[] a, int left, int right){
        if(left >= right) return;
        int mid = left + (right - left) / 2;

        mergeSort(a, left, mid);
        mergeSort(a, mid+1, right);
        merge(a, left, mid, right);
    }

    static void merge(int[] a, int left, int mid, int right){
        int[] res = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while(i <= mid && j <= right){
            if(a[i] <= a[j]){
                res[k++] = a[i++];
            }else{
                res[k++] = a[j++];
            }
        }
        while(i <= mid){
            res[k++] = a[i++];
        }
        while(j <= right){
            res[k++] = a[j++];
        }

        for (int k2 = 0; k2 < res.length; k2++) {
            a[left + k2] = res[k2];
        }
    }
}
