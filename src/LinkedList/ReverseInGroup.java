package LinkedList;

public class ReverseInGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode[] nodes = new ListNode[k];
        ListNode current = head;
        while(head.next!=null){
            for(int i=0;i<3;i++){
                nodes[i] = current;
                current = current.next;
            }
        }
        return head;

    }
}
