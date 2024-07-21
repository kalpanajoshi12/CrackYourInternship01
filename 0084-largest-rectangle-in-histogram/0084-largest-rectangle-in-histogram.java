class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int MaxArea = 0;
        int n = heights.length;
        for(int i = 0;i<=n;i++){
            while(!stack.isEmpty() && (i==n || heights[stack.peek()]>=heights[i])){
                int height = heights[stack.peek()];
                stack.pop();
                int width;
                if(stack.isEmpty()) width = i;
                else
                    width = i-stack.peek()-1;
                MaxArea = Math.max(MaxArea,width*height);
                
                
            }
            stack.push(i);
        }
        return MaxArea;
    }
}