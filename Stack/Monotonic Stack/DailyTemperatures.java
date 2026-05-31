
public int[] dailyTemperatures(int[] temperatures) {
    int n = temperatures.length;
    int[] res = new int[n];
    int[] map = new int[101];
    Stack<Integer> st = new Stack<>();
    
    for(int i = n-1; i >= 0; i--){
        while(!st.isEmpty() && st.peek() <= temperatures[i]) st.pop();

        if(!st.isEmpty()){
            res[i] = map[st.peek()] - i;
        }
        st.push(temperatures[i]);
        map[temperatures[i]] = i;
    }
    return res;
}
