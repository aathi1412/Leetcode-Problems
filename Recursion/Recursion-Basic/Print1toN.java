package basic;
public class print_1_to_n {
    public static void main(String[] args) {
        sum(1, 10);
    }

    public static void sum(int n, int range){
        if(n <= range){
            System.out.println(n);
            sum(n+1, range);
        }
    }
}

