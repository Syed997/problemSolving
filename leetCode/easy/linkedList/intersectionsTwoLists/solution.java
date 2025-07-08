/*
 Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
 */

 public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        while(currentA != null){
            ListNode currentB = headB;
            while(currentB != null){
                if(currentA == currentB) return currentA;
                currentB = currentB.next;
            }
            currentA = currentA.next;
        }
        return null;
    }
}