
import java.util.Stack;

public class DeleteMid {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        int mid = st.size() / 2;

        deleteMid(st, mid, 0);
        revStack(st);

        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
        
    }

    static void deleteMid(Stack<Integer> st, int mid, int curr){
        int top = st.pop();
        if(curr == mid){
            return;
        } 
        deleteMid(st, mid, curr + 1);
        st.push(top);
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
