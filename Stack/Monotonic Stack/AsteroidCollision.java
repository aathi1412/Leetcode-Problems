
public int[] asteroidCollision(int[] asteroids) {
    int n = asteroids.length;
    Stack<Integer> st = new Stack<>();
    // ArrayList<Integer> arr = new ArrayList<>();

    for(int i=0; i < n; i++){

        while(!st.isEmpty() && st.peek() > 0 && asteroids[i] < 0 && st.peek() < -asteroids[i]){
            st.pop();
        }
        if(!st.isEmpty() && asteroids[i] < 0 && st.peek() > 0){
            if(st.peek() == -asteroids[i]) st.pop();
        }else st.push(asteroids[i]);
        
    } 

    int[] res = new int[st.size()];
    int i = st.size() - 1;
    while(!st.isEmpty()){
        res[i--] = st.pop();
    }
    return res;
}
