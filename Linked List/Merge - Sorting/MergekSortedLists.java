
public ListNode mergeKLists(ListNode[] lists) {
    if(lists == null || lists.length == 0) return null;
    return mergeLists(lists, 0, lists.length - 1);
}

public ListNode mergeLists(ListNode[] lists, int start, int end){
    if(start == end) return lists[start];
    if(start == end - 1) return merge2Lists(lists[start], lists[end]);

    int mid = start + (end - start) / 2;
    ListNode left = mergeLists(lists, start, mid);
    ListNode right = mergeLists(lists, mid+1, end);
    return merge2Lists(left, right);
}

public ListNode merge2Lists(ListNode left, ListNode right){
    ListNode dum = new ListNode(0);
    ListNode curr = dum;

    while(left != null && right != null){
        if(left.val > right.val){
            curr.next = right;
            right = right.next;
            curr = curr.next;
        }
        else{
            curr.next = left;
            left = left.next;
            curr = curr.next;
        }
    }
    if(left != null) curr.next = left;
    if(right != null) curr.next = right;

    return dum.next;
}
