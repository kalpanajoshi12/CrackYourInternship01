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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode middle = middleNode(head);
        ListNode left = head;
        ListNode right = middle.next;
        middle.next = null;
        left = sortList(left);
        right = sortList(right);
        return mergeTwoLists(left,right);
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null ){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        ListNode dummy = new ListNode(-1);
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode current = dummy;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                current.next =temp1;
                temp1= temp1.next;
                current = current.next;
            }else{
                current.next = temp2;
               temp2 = temp2.next;
                current = current.next;
            }
          
        }
        if(temp1==null){
            current.next = temp2;
        }
        if(temp2==null){
            current.next = temp1;
        }
         

        return dummy.next;
        
    }


     public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast !=null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}