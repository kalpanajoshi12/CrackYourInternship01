class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MyStack() {
       queue1  = new LinkedList<>();
       queue2 = new LinkedList<>();

    }
    
    public void push(int x) {
        if(queue2.isEmpty()){
            queue2.add(x);
            if(!queue1.isEmpty()){
                while(!queue1.isEmpty()){
                    int y = queue1.remove();
                    queue2.add(y);
                }
            }
            while(!queue2.isEmpty()){
                int k = queue2.remove();
                queue1.add(k);
            }
        }
        return;
    }
    
    public int pop() {
        if(!queue1.isEmpty()){
            int y = queue1.remove();
            return y;
        }
        return -1;
    }
    
    public int top() {
        if(!queue1.isEmpty()){
            int y = queue1.peek();
            return y;
        }
        return -1;
    }
    
    public boolean empty() {
        if(queue1.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */