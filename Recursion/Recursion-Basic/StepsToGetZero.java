
public class StepsToGetZero {
    public static void main(String[] args) {
        int step = 0;
        System.out.println(count(123, step));
    }

    static int count(int n, int step){
        if(n == 0) return step;
        if((n & 1) == 1){
            return count(n-1, step + 1);
        }
        n /= 2;
        return count(n, step + 1);
    }
}
