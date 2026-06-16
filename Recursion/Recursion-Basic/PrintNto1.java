package basic;
public class print_n_to_1 {
    public static void main(String[] args) {
        sum(10);
    }

    public static void sum(int n){
        if(n > 0){
            System.out.println(n);
            sum(n-1);
        }
    }
}