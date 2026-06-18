
public class CountZeros {
    public static void main(String[] args) {
        int c = 0;
        System.out.println(count(30204, c));
    }

    static int count(int n, int c){
        if(n == 0) return c;
        int d = n%10;
        if(d == 0) c++;
        return count(n/10, c);
    }
}
