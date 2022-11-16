package javadp.LinkedList;

public class ReverseRecursive {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next==null) return head;
        //ABCD --> A was head, it will be connected at the end of reverse(B,C,D), B was A.next (head.next)
        // So to connect A to reverse of BCD (D-> C -> B), B.nxt = A, A.next = null , here B = prev head.next
        ListNode headOfRest = head.next;
        ListNode newHead = reverseList(head.next);
        headOfRest.next = head;
        head.next = null;
        return newHead;
    }
}
