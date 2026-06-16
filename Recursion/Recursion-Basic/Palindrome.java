package basic;
public class palindrome {
    public static void main(String[] args) {
        String s = "MALAYALAM";
        System.out.println(pal(s, 0, s.length()-1));
    }

    public static boolean pal(String s, int left, int right){
        if(left > right) return true;
        if(s.charAt(left) != s.charAt(right)) return false;
        return pal(s, left+1, right-1);
    }
}
