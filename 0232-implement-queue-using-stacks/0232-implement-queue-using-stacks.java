class MyQueue {
Stack<Integer> stack1;
Stack<Integer> stack2;
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        if(stack1.isEmpty() && stack2.isEmpty()){
            stack1.push(x);
        }else{
            while(!stack1.isEmpty()){
                int y = stack1.pop();
                stack2.push(y);
            }
            stack1.push(x);
            while(!stack2.isEmpty()){
                int y = stack2.pop();
                stack1.push(y);
            }
        }
        return;
    }
    
    public int pop() {
        if(!stack1.isEmpty()){
            int y = stack1.pop();
            return y;
        }
        return -1;
    }
    
    public int peek() {
        if(!stack1.isEmpty()){
            int y = stack1.peek();
            return y;
        }
        return -1;
    }
    
    public boolean empty() {
        if(!stack1.isEmpty()){
            return false;
        }
        return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */