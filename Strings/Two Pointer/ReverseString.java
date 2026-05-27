
public void reverseString(char[] s) {
    int left = 0;
    int right = s.length-1;

    if(s.length == 1) return;

    while(left < right){
        char c = s[left];
        s[left] = s[right];
        s[right] = c;

        left++;
        right--;
    }
}
