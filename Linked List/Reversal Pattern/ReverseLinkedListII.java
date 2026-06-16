
public ListNode reverseBetween(ListNode head, int left, int right) {
    if(head.next == null) return head;

    ListNode dummy = new ListNode(1);
    dummy.next = head;

    ListNode start = dummy;
    ListNode end = head;
    for(int i=0; i<left-1; i++) {
        start = start.next;
        end = end.next;
    }

    ListNode L = null;
    ListNode R = end;

    for(int i=0; i <= right-left; i++){
        ListNode temp = R.next;
        R.next = L;
        L = R;
        R = temp;
    }
    start.next = L;
    end.next = R;
    return dummy.next;
}
