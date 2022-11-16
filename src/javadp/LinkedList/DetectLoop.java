package javadp.LinkedList;

public class DetectLoop {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode low = head;
        ListNode high = head.next;

        while(low!=null && high!=null && high.next!=null){
            if(low==high) return true;
            low = low.next;
            high = high.next.next;
        }
        return false;
    }

}
