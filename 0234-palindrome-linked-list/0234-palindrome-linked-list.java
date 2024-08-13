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
    public ListNode getMiddleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverseLinkedList(ListNode head){
        ListNode dummy = new ListNode();
        dummy = null;
        while(head!=null){
            ListNode next = head.next;
            head.next= dummy;
            dummy = head;
            head = next;
        }
        return dummy;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode middle = getMiddleNode(head);
        ListNode prev = middle.next;
        prev = reverseLinkedList(prev);
        ListNode slow = head;
        while(prev!=null && slow!=middle.next){
            if(slow.val!=prev.val){
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }
        return true;
    }
}