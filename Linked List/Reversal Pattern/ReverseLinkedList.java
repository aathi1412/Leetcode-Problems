public ListNode reverseList(ListNode head) {
    ListNode left = null;
    ListNode right = head;

    while(right != null){
        ListNode temp = right.next;
        right.next = left;
        left = right;
        right = temp;
    }
    return left;
}
