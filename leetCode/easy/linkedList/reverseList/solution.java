/*
 Given the head of a singly linked list, reverse the list, and return the reversed list.
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
    public ListNode reverseList(ListNode head) {
        ListNode dummyHead = new ListNode(-2);
        ListNode currentNode = head;
        if(head == null || head.next == null) return head;
        while(currentNode != null){
            ListNode newNode = new ListNode(currentNode.val, currentNode.next);
            newNode.next = dummyHead.next;
            dummyHead.next = newNode;
            currentNode = currentNode.next;
        }
        return dummyHead.next;
    }
}