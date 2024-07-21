/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
     if(head==null || head.next==null || head.next.next==null){
        return false;
     }   
     ListNode start=head;
     ListNode end=head;
     while(end.next!=null && end.next.next!=null){
        start=start.next;
        end=end.next.next;
        if(start==end){
            return true;
        }
     }
     return false;
    }
}