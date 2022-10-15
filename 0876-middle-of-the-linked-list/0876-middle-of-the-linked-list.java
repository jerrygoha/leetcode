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
    public ListNode middleNode(ListNode head) {
        
        ListNode firstPointer = head;
        ListNode secondPointer = head;
        
        //secondPointer가 firstPointer보다 두배 빠른 속도로 이동.
        while(secondPointer != null && secondPointer.next != null){
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next.next;
        }
        
        return firstPointer;
    }
}