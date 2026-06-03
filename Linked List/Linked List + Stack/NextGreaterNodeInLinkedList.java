
public int[] nextLargerNodes(ListNode head) {
    // reverse ---------------
    int size = 0;
    ListNode left = null;
    while(head != null){
        ListNode temp = head.next;
        head.next = left;
        left = head;
        head = temp;
        size++;
    }
    head = left;

    // ------------------------
    int[] res = new int[size];
    int[] stack = new int[size];
    int top = -1;
    while(head != null){
        if(top >= 0){
            while(top >= 0 && head.val >= stack[top]){
                top--;
            }
        }
        if(top == -1) res[size-1] = 0;
        else res[size-1] = stack[top];
        size--;
        stack[++top] = head.val;
        head = head.next;
    }
    return res;
}
