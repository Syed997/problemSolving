/*
 Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 */

 // TODO: need to check for optimize solution

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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode dummyHead = new ListNode(-2);
        ListNode currentNode = head;
        int count = 0;
        while(currentNode != null){
            ListNode newNode = new ListNode(currentNode.val);
            newNode.next = dummyHead.next;
            dummyHead.next = newNode;
            currentNode = currentNode.next;
            count++;
        }
        ListNode currentA = head;
        ListNode currentB = dummyHead.next;
        for(int i=0; i<(count/2); i++){
            if(currentA.val != currentB.val) return false;
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return true;
    }
}