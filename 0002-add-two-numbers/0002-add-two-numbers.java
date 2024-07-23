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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        dummy.next=null;
        ListNode start1 = l1;
        ListNode start2 = l2;
        int sum = 0;
        int divide = 0;
        ListNode temp = dummy;
        while(start1!=null && start2!=null){

            sum = start1.val+start2.val+divide;
            divide = sum/10;
            int reminder = sum%10;
            ListNode newNode = new ListNode();
            temp.next = newNode;
            temp=temp.next;
            temp.val = reminder;
            start1=start1.next;
            start2=start2.next;
        }
        while(start1!=null && start2==null){
             sum = start1.val+divide;
            divide = sum/10;
           int reminder = sum%10;
            ListNode newNode = new ListNode();
            temp.next = newNode;
            temp=temp.next;
            temp.val = reminder;
            start1=start1.next;
            
        }
        while(start2!=null && start1==null){
             sum = start2.val+divide;
            divide = sum/10;
            int reminder = sum%10;
            ListNode newNode = new ListNode();
            temp.next = newNode;
            temp=temp.next;
            temp.val = reminder;
            
            start2=start2.next;
        }
        while(divide>0){
             sum = divide;
            divide = sum/10;
            int reminder = sum%10;
            ListNode newNode = new ListNode();
            temp.next = newNode;
            temp=temp.next;
            temp.val = reminder;
        }
        return dummy.next;
    }
}