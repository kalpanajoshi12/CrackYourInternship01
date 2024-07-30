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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-400);
        dummy.next = head;
        ListNode prev= dummy;
        ListNode slow = dummy;
        ListNode fast = head;
        while(fast!=null){
            if(slow.val==fast.val){
                while(fast!=null && slow.val==fast.val){
                    fast=fast.next;
                }
                slow=prev;
                slow.next=fast;
            }
            prev=slow;
            slow=slow.next;
            if(fast!=null){
                fast=fast.next;
            }
        }
        return dummy.next;
    }
}