
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode resOG = new ListNode(0);
    ListNode res = resOG;
    int carry = 0;

    while(l1 != null || l2 != null || carry != 0){
        int d1 = (l1 == null) ? 0 : l1.val;
        int d2 = (l2 == null) ? 0 : l2.val;

        int sum = d1 + d2 + carry;
        int d = sum % 10;
        carry = sum / 10;

        ListNode node = new ListNode(d);
        res.next = node;
        res = res.next;

        l1 = (l1 == null) ? null : l1.next;
        l2 = (l2 == null) ? null : l2.next;
    }
    res = null;
    return resOG.next;
}
