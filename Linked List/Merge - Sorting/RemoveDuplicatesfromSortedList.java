
public ListNode deleteDuplicates(ListNode head) {
    if(head == null || head.next == null) return head;

    ListNode res = new ListNode(101);
    res.next = head;
    ListNode prev = res;
    ListNode curr = head;

    while(curr != null){
        while(prev.val == curr.val){
            if(curr.next == null){
                prev.next = null;
                return res.next;
            }
            curr = curr.next;
        }
        prev.next = curr;
        prev = prev.next;
        curr = curr.next;
    }
    return res.next;
}
