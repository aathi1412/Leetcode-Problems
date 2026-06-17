
public class FindSortOrNot {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,0};
        System.out.println(sort(n, 0));
    }   

    static boolean sort(int[] n, int i){
        if(i == n.length) return true;
        if(i > 0 && n[i] < n[i-1]) return false;
        return sort(n, ++i);
    }
}
