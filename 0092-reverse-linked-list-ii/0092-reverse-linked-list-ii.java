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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        dummy.next = head;
        for(int i =0;i<left-1;i++){
            prev = prev.next;
        }
        ListNode current = prev.next;
        for(int i = 0;i<right-left;i++){
            ListNode temp = current.next;
            current.next = temp.next;
            temp.next=prev.next;
            prev.next=temp;
        }
        return dummy.next;
    }
}