class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[temperatures.length]; 
        for(int i = temperatures.length-1;i>=0;i--){
            while(!stack.isEmpty()&&temperatures[i]>=temperatures[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                answer[i] = stack.peek()-i;
            }
            stack.push(i);

        }
        return answer;
    }
}