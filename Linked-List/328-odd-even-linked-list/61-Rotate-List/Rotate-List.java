class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode tail=head;
        int length=1;

        while(tail.next!=null){
            tail=tail.next;
            length++;
        }

        tail.next=head;

        int Stoptohead=length-(k%length);
        ListNode newtail=tail;

        while (Stoptohead-- > 0) {
            newtail = newtail.next;
        }

        ListNode Newhead=newtail.next;
        newtail.next=null;

        return Newhead;

    }
}