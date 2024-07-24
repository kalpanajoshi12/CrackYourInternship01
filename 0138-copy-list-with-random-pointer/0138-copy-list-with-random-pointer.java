/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        if(head==null){return head;}
        while(temp!=null){
            Node newNode = new Node(temp.val);
            newNode.next= temp.next;
            temp.next=newNode;
            temp=temp.next.next;
        }
        Node p1 = head;
        while(p1!=null){
            if(p1.random==null){
                p1.next.random = null;
            }
            else{
                p1.next.random = p1.random.next;
            }
            p1=p1.next.next;
        }
         Node p2 = head;
      Node p3 = head.next;
      Node newhead = p3;
      while(p2!=null && p3!=null){
        if(p3 == head.next){
            newhead = p3;
        }
        if(p2.next==null){
            p3.next = null;
        }else{
          p2.next = p2.next.next;
          if(p2.next==null){
              p3.next = null;
          }else{
            p3.next = p3.next.next;
          }
          
        }
        p2 = p2.next;
        p3 = p3.next;
       

      }
      return newhead;
    }
}