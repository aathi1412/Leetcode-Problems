
public void reorderList(ListNode head) {
    if(head == null || head.next == null) return;
    ListNode slow = head;
    ListNode fast = head.next;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    ListNode first = head;
    ListNode sec = slow.next;
    slow.next = null;

    // revers-----------
    ListNode left = null;
    while(sec != null){
        ListNode temp = sec.next;
        sec.next = left;
        left = sec;
        sec = temp;
    }
    sec = left;

    // Reorder----------------
    ListNode curr = first;
    while(sec != null){
        ListNode temp = curr.next;
        curr.next = sec;
        sec = sec.next;
        curr = curr.next;
        curr.next = temp;
        curr = curr.next;
    }
    head = first;
    // System.out.print(sec.val);
}
