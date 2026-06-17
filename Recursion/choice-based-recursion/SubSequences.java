

import java.util.ArrayList;

public class SubSequences {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(subSequence("", s));
        System.out.println(count);
    }
    static int count = 0;
    public static ArrayList<String> subSequence(String p, String s) {
        if(s.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            count++;
            return list;
        } 

        char ch = s.charAt(0);
        ArrayList<String> left = subSequence(p + ch, s.substring(1));
        ArrayList<String> right = subSequence(p, s.substring(1));

        left.addAll(right);
        return left;
    }
}
