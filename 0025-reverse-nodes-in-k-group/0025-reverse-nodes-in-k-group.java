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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next == null){
            return head;
        }
        int length = findlength(head);
        ListNode dummyhead = new ListNode();
        dummyhead.next = head;
        ListNode prenode = dummyhead;
        ListNode temp ;
        ListNode nextnode;
        while(length>=k){
            temp = prenode.next;
            nextnode = temp.next;
            for(int i = 1;i<k;i++){
                temp.next = nextnode.next;
                nextnode.next = prenode.next;
               prenode.next = nextnode;
               nextnode = temp.next;
            }
            prenode = temp;
            length-=k;
        }
        return dummyhead.next;
    }
    public static int findlength(ListNode head){
        int length= 0;
        while(head!=null){
            ++length;
            head= head.next;
        }
        return length;
    }
}