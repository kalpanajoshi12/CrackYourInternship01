class Solution {
    public int maxArea(int[] height) {
        int MaxArea = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length-1;
        while(i<j && j<height.length){
            int min = Math.min(height[i],height[j]);
            int hieght = min;
            int width = j-i;
            int Area = hieght*width;
            MaxArea = Math.max(Area,MaxArea);
            if(height[i]==min){
                i++;
            }
            else{
                j--;
            }
        }
        return MaxArea;
    }
}