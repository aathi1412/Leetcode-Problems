
public ListNode rotateRight(ListNode head, int k) {
    if(head == null) return head;
    ListNode tail = head;
    int len = 1;
    while(tail.next != null){
        len++;
        tail = tail.next;
    }
    k = k % len;
    if(k == 0) return head;

    ListNode curr = head;
    for(int i = 0; i < len - k - 1; i++){
        curr = curr.next;
    }
    tail.next = head;
    head = curr.next;
    curr.next = null;
    return head;
}
