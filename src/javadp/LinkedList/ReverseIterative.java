package javadp.LinkedList;

public class ReverseIterative {
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = head.next;

        while(temp!=null){
            curr.next = prev;
            prev = curr;
            curr = temp;
            temp = curr.next;
        }
        curr.next = prev;

        return curr;
    }
}
