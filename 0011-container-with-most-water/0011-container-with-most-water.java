class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxlength = 0;
        while(left<right){
            int length = right-left;
            int min=Math.min(height[left],height[right]);
            int multiply = length*min;
            maxlength=Math.max(maxlength,multiply);
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
            
        }
        return maxlength;
    }
}