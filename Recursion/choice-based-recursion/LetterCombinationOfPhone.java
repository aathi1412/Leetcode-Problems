

import java.util.ArrayList;

public class LetterCombinationOfPhone {
    public static void main(String[] args) {
        String digits = "23";
        String[] phoneMap = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        System.out.println(lcp(digits, "", phoneMap));
    }

    static ArrayList<String> L_C_P(String digits, String p){
        if(digits.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = digits.charAt(0) - '0';
        ArrayList<String> res = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3 ; i++) {
            char ch = (char) ('a' + i);
            res.addAll(L_C_P(digits.substring(1), p + ch));
        }

        return res;
    }
    
    static ArrayList<String> lcp(String digits, String p, String[] phoneMap){
        if(digits.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> res = new ArrayList<>();
        int digit = digits.charAt(0) - '0';
        String letter = phoneMap[digit];

        for (int i = 0; i < letter.length(); i++) {
            char ch = letter.charAt(i);
            res.addAll(lcp(digits.substring(1), p + ch, phoneMap));
        }
        return res;
    }
}
