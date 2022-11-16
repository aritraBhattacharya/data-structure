package javadp.LinkedList;

public class ReverseInGroup {
    ListNode finalHead = null;
    ListNode tempTail = null;

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode curr = head;
        ListNode tempHead = head;
        int count = 1;
        while (curr.next!=null){
            if(count==k){
                count =1;
                reverse(tempHead,curr);
                tempHead = curr;
                curr = curr.next;
            }
            else{
                curr = curr.next;
                count++;
            }
        }
        if(count<k){
            tempTail.next=tempHead;
        }
        return finalHead;

    }

    private void reverse(ListNode head, ListNode tail) {
        tail.next = null;
        ListNode newHead = reverseList(head);


        if(finalHead==null) {
            finalHead = newHead;
        }
        else{
            tempTail.next=newHead;
        }
        tempTail = head;

    }
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
