
public ListNode removeNodes(ListNode head) {

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
    int[] stack = new int[size];
    int top = -1;
    while(head != null){
        if(top >= 0){
            if(head.val >= stack[top]){
                stack[++top] = head.val;
            }
        }
        else{
            stack[++top] = head.val;
        }
        head = head.next;
    }

    //------------------
    head = null;
    ListNode dum = new ListNode(0);
    head = dum;
    while(top != -1){
        ListNode n = new ListNode(stack[top--]);
        head.next = n;
        head = head.next;
    }

    return dum.next;

}
