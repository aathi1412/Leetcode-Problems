
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    ListNode res = new ListNode(0);
    ListNode dum = res;
    while(list1 != null && list2 != null){
        if(list1.val <= list2.val){
            dum.next = list1;
            list1 = list1.next;
        }
        else{
            dum.next = list2;
            list2 = list2.next;
        }
        dum = dum.next;
    }
    if(list1 != null) dum.next = list1;
    if(list2 != null) dum.next = list2;
    return res.next;
}
