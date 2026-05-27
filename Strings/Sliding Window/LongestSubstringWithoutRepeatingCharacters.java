
public int lengthOfLongestSubstring(String s) {
  if(s.length() <= 1) return s.length();
  
  int left = 0, maxLen = 0;
  HashMap <Character, Integer> map = new HashMap<>();
  
  for(int right = 0; right < s.length(); right++){
      char c = s.charAt(right);
  
      while(map.containsKey(c)){
          char ch = s.charAt(left);
          map.put(ch, map.getOrDefault(ch, 0) - 1);
          if(map.get(ch) == 0){
              map.remove(ch);
          }
          left++;
      }
      map.put(c, map.getOrDefault(c, 0) + 1);
      maxLen = Math.max(maxLen, right-left+1);
  }
  
  return maxLen;
}
