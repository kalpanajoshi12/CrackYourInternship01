/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
 
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode forword = head;
        
       
        while(forword != null && forword.next!=null)
        {
            if(forword.next.val ==  forword.val){
                
               forword.next= forword.next.next;
                continue;
            }
                //forword = forword.next;
               // current.next = forword;
                //current = forword;
                forword = forword.next;
        }
      //current.next = null;
        return head;

    }
}