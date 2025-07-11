/*
 You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
 */

//TODO: need to implement recussive solution as well

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
        ListNode dummyHead = new ListNode(-2);
        ListNode currentNode = dummyHead;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                currentNode.next = list1;
                currentNode = currentNode.next;
                list1 = list1.next;
            }
            else{
                currentNode.next = list2;
                currentNode = currentNode.next;
                list2 = list2.next;
            }
        }
        if(list1 != null){
            currentNode.next = list1;
        }
        else{
            currentNode.next = list2;
        }
        return dummyHead.next;
    }
}