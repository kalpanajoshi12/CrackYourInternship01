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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev = head;
        ListNode temp = head.next;
        ListNode head2 = head.next;
        while( temp!=null && temp.next!=null){
            prev.next = prev.next.next;
            temp.next = temp.next.next;
            prev = prev.next;
            temp = temp.next;
     }
     prev.next = head2;
     return head;
    }
    
    
}