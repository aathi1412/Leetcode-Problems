

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Subsets {
    public static void main(String[] args) {
        int[] a = {1,2,2};
        List<List<Integer>> arr = subsetsDuplicate(a);
        for(List<Integer> n: arr){
            System.out.print(n.toString() + ", ");
        }
    }
    
    public static List<List<Integer>> subsets(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num: arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;
    }

    static List<List<Integer>> subsetsDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            if(i > 0 && arr[i] == arr[i-1]){
                start = end;
            }
            end = outer.size();
            for (int j = start; j < end; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }
}
