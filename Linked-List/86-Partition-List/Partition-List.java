class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        ListNode beforeHead = new ListNode(0);
        ListNode afterHead = new ListNode(0);

        ListNode prev = beforeHead;
        ListNode curr = afterHead;
        
        while(temp!=null){
            if(temp.val<x){
            prev.next = new ListNode(temp.val);
            prev = prev.next;
            } else{
              curr.next = new ListNode(temp.val);
              curr = curr.next;
            }
            temp=temp.next;
        }

        prev.next=afterHead.next;
        return beforeHead.next;
    }
}