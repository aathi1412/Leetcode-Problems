
public ListNode sortList(ListNode head) {
    // base case --------
    if(head == null || head.next == null) return head;

    // split-----------
    ListNode left = head;
    ListNode right = getMid(head);
    ListNode t = right.next;
    right.next = null;
    right = t;

    //-------------
    left = sortList(left);
    right = sortList(right);
    return merge(left, right);
}

public ListNode getMid(ListNode curr){
    ListNode slow = curr;
    ListNode fast = curr.next;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

public ListNode merge(ListNode l1, ListNode l2){
    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;

    while(l1 != null && l2 != null){
        if(l1.val > l2.val){
            curr.next = l2;
            l2 = l2.next;
            curr = curr.next; 
        }
        else{
            curr.next = l1;
            l1 = l1.next;
            curr = curr.next; 
        }
    }
    if(l1 != null) curr.next = l1;
    if(l2 != null) curr.next = l2;
    return dummy.next;
}
