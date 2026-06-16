
public boolean isPalindrome(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }

    ListNode left = null;
    while(slow != null){
        ListNode temp = slow.next;
        slow.next = left;
        left = slow; 
        slow = temp;
    }
    ListNode start = head, end = left;
    while(end != null){
        if(start.val != end.val) return false;
        start = start.next;
        end = end.next;
    }
    return true;
}
