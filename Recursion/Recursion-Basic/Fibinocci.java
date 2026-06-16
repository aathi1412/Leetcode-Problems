package basic;
public class fibinocci{
    public static void main(String[] args){
        System.out.println(fibi(3));
    }

    public static int fibi(int n){
        if(n == 1 || n == 2) return 1;
        return fibi(n-1) + fibi(n-2);
    }
}