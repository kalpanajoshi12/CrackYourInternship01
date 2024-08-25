class LRUCache {
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int key,int value){
            this.key = key;
            this.value = value;
           
        }
    }
     int capacity;
     Node head = new Node(-1,-1) ;
     Node tail = new Node(-1,-1) ;;
     HashMap<Integer,Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
       
    }
    
    public int get(int key) {
        if(map.containsKey(key)){

            Node res = map.get(key);
            int ans = res.value;
            map.remove(key);
            deleteNode(res);
            addNode(res);
            map.put(key,head.next);
            return ans;
            
        }
        
        
        return -1;
    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key)){
            Node current = map.get(key);
            map.remove(key);
            deleteNode(current);
        }
        if(map.size()==capacity){
           map.remove(tail.prev.key);
           deleteNode(tail.prev);
        }
     
        addNode(new Node(key,value));
        map.put(key,head.next);
        
         return;
        }
        
     private void addNode(Node newNode){
       Node temp = head.next;
       newNode.next = temp;
       newNode.prev = head;
       head.next = newNode;
       temp.prev = newNode;
       return;
    } 

    private void deleteNode(Node node)  {
        Node prevprev = node.prev;
        Node nextnext = node.next;

        prevprev.next = nextnext;
        nextnext.prev = prevprev;
        return;
    } 
                
           
}         
        
    
    



/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */