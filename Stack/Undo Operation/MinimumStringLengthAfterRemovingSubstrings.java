
public int minLength(String s) {
    char[] stack = new char[s.length()];
    int top = -1;

    for(char ch : s.toCharArray()){
        
        if(top >= 0 && ((ch == 'B' && stack[top] == 'A') || (ch == 'D' && stack[top] == 'C'))){
            top--;
        } 
        else stack[++top] = ch;
    }
    return top + 1;
}
