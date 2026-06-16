package basic;
public class ReverseNumber {
    public static void main(String[] args) {
        rev(54321);
        System.out.println(rev);
    }

    static int rev = 0;

    static void rev(int n){
        if(n == 0) return;
        int d = n%10;
        rev = rev*10+d;
        rev(n/10);
    }
}