
public boolean backspaceCompare(String s, String t) {
    int i = s.length() - 1;
    int j = t.length() - 1;

    while(i >= 0 || j >= 0){
        i = help(s, i);
        j = help(t, j);

        if(i >= 0 && j >= 0){
            if(s.charAt(i) != t.charAt(j)) return false;
        }
        else{
             if(i >= 0 || j >= 0) return false;
        }

        i--;
        j--;
    } 

    return true;
}

public int help(String s, int idx){
    int skip = 0;
    while(idx >= 0){
        if(s.charAt(idx) == '#'){
            skip++;
            idx--;
        }
        else if(skip > 0){
            skip--;
            idx--;
        }
        else break;
    }
    return idx;
}
