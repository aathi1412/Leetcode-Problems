
public String minWindow(String s, String t) {
    if(s.length() < t.length()) return "";
    
    int[] freq = new int[128];

    for(int i=0; i<t.length(); i++) freq[t.charAt(i)]++;

    int left = 0, minLen = Integer.MAX_VALUE, start = 0, needed = t.length(); 

    for(int right = 0; right < s.length(); right++){
        int r = s.charAt(right);
        if(freq[r] > 0){
            needed--;
        }
        freq[r]--;

        while(needed == 0){
            if(right - left + 1 < minLen){
                minLen = right - left + 1;
                start = left;
            }

            int l = s.charAt(left);
            freq[l]++;
            if(freq[l] > 0){
                needed++;
            }

            left++;
        }
    }
    return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start+minLen);
}
