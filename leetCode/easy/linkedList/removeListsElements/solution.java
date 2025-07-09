/*
 Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 */

 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode dummyHead = new ListNode(-2);
        ListNode currentNode = dummyHead;
        ListNode checkNode = head;
        while(checkNode != null){
            if(checkNode.val != val){
                currentNode.next = checkNode;
                currentNode = currentNode.next;
            }
            checkNode = checkNode.next;
            currentNode.next = null;
        }
        return dummyHead.next;
    }
}