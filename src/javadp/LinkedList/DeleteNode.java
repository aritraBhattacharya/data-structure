package javadp.LinkedList;

//https://leetcode.com/problems/delete-node-in-a-linked-list/

/* Ding this in singly linkedList is different,
* IF YOU ARE GIVEN THE NODE TO BE DELETED, AND NO HEAD IS PROVIDED, THE PREVIOUS ELEMENT OF THE NODE TO BE
* DELETED CAN NOT BE ACCESSED
*
* A B C D E --> Delete C
* copy D's value to C, then make that element (previously C now D) point to next element of D*/

public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
