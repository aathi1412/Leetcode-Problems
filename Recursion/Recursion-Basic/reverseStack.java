

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        
        revStack(st);
        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }

    static void revStack(Stack<Integer> st){
        int top = st.pop();
        if(st.isEmpty()){
            st.push(top);
            return;
        } 
        revStack(st);
        insert(st, top);
    }

    static void insert(Stack<Integer> st, int x){
        
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int temp = st.pop();
        insert(st, x);
        st.push(temp);
    }
}
