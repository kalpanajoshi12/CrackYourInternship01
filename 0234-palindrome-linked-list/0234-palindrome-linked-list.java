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
        if(head==null && head.next==null){
          return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        
    while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
       slow = slow.next;
       ListNode pre = null;
       ListNode next = null;
       while(slow!=null){
           next= slow.next;
           slow.next = pre;
           pre = slow;
           slow = next;
       }
        while(pre!=null){
            if(head.val!=pre.val){
                return false;
            }
            head = head.next;
            pre = pre.next;
        }
        
        
      return true;

    }
}