

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String s = "123";
        System.out.println(permutationList(s, ""));
        System.out.println(countPermutation(s, ""));
        
    }

    // print all permutations
    static void permutation(String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i = 0; i <= p.length(); i++){
            String s = p.substring(0, i);
            String e = p.substring(i);

            permutation(up.substring(1), s + ch + e);
        }
    }

    //  return all permutations in arraylist
    static ArrayList<String> permutationList(String up, String p){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> res = new ArrayList<>();

        for(int i = 0; i <= p.length(); i++){
            String s = p.substring(0, i);
            String e = p.substring(i);
            ArrayList<String> curr = permutationList(up.substring(1), s + ch + e);
            res.addAll(curr);
        }
        
        return res;
    }

    //  count number of permutation
    static int countPermutation(String up, String p){
        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;

        for(int i = 0; i <= p.length(); i++){
            String s = p.substring(0, i);
            String e = p.substring(i);
            count = count + countPermutation(up.substring(1), s + ch + e);
        }
        
        return count;
    }
}
