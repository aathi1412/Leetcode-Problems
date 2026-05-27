
public String longestPalindrome(String s) {
    if(s.length() < 2) return s;

    int left = -1, len = -1;

    for(int i=0; i<s.length(); i++){
        int oddLen = odd(s, i, i);
        int evenLen = even(s, i, i+1);

        if(len < Math.max(oddLen, evenLen)){
            len = Math.max(oddLen, evenLen);
            left = i - (len - 1) / 2;
        }
    }
    
    return s.substring(left, left+len);
}

public static int odd(String s, int left, int right){
    while((left >= 0 && right <= s.length()-1) && s.charAt(left) == s.charAt(right)){
        left--; right++;
    }
    return right - left - 1;
}

public static int even(String s, int left, int right){
    while((left >= 0 && right <= s.length()-1) && s.charAt(left) == s.charAt(right)){
        left--; right++;
    }
    return right - left - 1;
}
