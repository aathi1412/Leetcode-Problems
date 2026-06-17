

public class SkipCharacter {
    public static void main(String[] args) {
        String s = "abacapplecadacapp";

        skipCharacter(s, 0, new StringBuilder());

        String sb = skipCharacter(s);
        System.out.println(sb);
    }

    // skip any character using pure recursive approach
    public static String skipCharacter(String s) {
        if(s.isEmpty()) return "";

        char ch = s.charAt(0);
        if(ch == 'a') return skipCharacter(s.substring(1));
        else return ch + skipCharacter(s.substring(1));
    }

    // skip any character using basic recursive approach
    public static void skipCharacter(String s, int i, StringBuilder sb) {
        if(i == s.length()) return;

        if(s.charAt(i) != 'a') sb.append(s.charAt(i));
        skipCharacter(s, i+1, sb);
    }


}
