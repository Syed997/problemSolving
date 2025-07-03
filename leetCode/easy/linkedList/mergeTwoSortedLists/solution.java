/*
 You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
 */

//TODO: not sorting properly returning the list1 as it is

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode currentNode1 = list1;
        ListNode currentNode2 = list2;
        while(currentNode1.next != null){
            while(currentNode2.next != null){
                if(currentNode1.val > currentNode2.val){
                    ListNode node = new ListNode(currentNode2.val, currentNode1.next);
                    currentNode1.next = node;
                }
                currentNode2 = currentNode2.next;
            }
            currentNode1 = currentNode1.next;
        }
        return list1;
    }
}