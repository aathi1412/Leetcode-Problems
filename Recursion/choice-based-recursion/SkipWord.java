

public class SkipWord {
    public static void main(String[] args) {
        String s = "abacapplecadacapp";
        String sb = skipAppNotApple(s);
        System.out.println(sb);
    }

    //  skip word apple in a string
    public static String skipApple(String s) {
        if(s.isEmpty()) return "";

        if(s.startsWith("apple")) return skipApple(s.substring(5));
        else return s.charAt(0) + skipApple(s.substring(1));
    }

    // skip app if it alone but not app in apple
    public static String skipAppNotApple(String s) {
        if(s.isEmpty()) return "";

        if(s.startsWith("app") && !s.startsWith("apple")) return skipAppNotApple(s.substring(3));
        else return s.charAt(0) + skipAppNotApple(s.substring(1));
    }

}
