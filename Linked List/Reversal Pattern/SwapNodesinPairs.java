
public ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode curr = head, prev = dummy;

    while(curr != null && curr.next != null){
        ListNode sec = curr.next;
        ListNode nxtPair = curr.next.next;

        //reverse
        sec.next = curr;
        curr.next = nxtPair;
        prev.next = sec;

        // update prev
        prev = curr;
        curr = nxtPair;
    }
    return dummy.next;
}
