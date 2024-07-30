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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head;
        }
       ListNode dummyLeft = new ListNode();
       ListNode dummyRight = new ListNode();
       ListNode current1 = dummyLeft;
       ListNode current2 = dummyRight;
       while(head!=null){
        if(head.val<x){
            current1.next = head;
            current1 = current1.next;
        }else{
             current2.next = head;
            current2 = current2.next;
        }
         head=head.next;
       }
       current2.next = null;
       current1.next=dummyRight.next;
       return dummyLeft.next;
    }
}