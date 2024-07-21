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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        ListNode start=head;
        ListNode prev = dummy;
        dummy.next = head;
        if(head==null){
            return head;
        }
        while(start!=null){
            if(start.val==val){
                start=start.next;
                prev.next = start;
            }else{
                start=start.next;
                prev = prev.next;
            }
        }
        return dummy.next;
    }
}