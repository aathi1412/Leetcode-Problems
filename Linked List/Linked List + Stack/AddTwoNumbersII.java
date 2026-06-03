
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    // list 1---------------
    l1 = reverse(l1);

    // list 2 --------------
    l2 = reverse(l2);;

    // addition-------------
    ListNode res = new ListNode(0);
    ListNode dum = res;
    int carry = 0;

    while(l1 != null || l2 != null || carry != 0){
        int d1 = l1 == null ? 0 : l1.val;
        int d2 = l2 == null ? 0 : l2.val;

        int sum = d1 + d2 + carry;
        int ans = sum % 10;
        carry = sum / 10;

        ListNode node = new ListNode(ans);
        dum.next = node;
        dum = dum.next;

        l1 = l1 == null ? null : l1.next;
        l2 = l2 == null ? null : l2.next; 

    }

    ListNode curr = reverse(res.next);
    return curr;
}

public ListNode reverse(ListNode curr){
    ListNode left = null;
    while(curr != null){
        ListNode temp = curr.next;
        curr.next = left;
        left = curr;
        curr = temp;
    }
    curr = left;
    return curr;
}
