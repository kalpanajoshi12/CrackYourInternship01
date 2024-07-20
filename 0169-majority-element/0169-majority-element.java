class Solution {
    public int majorityElement(int[] nums) {
        int i = 1;
        int n = nums.length;
        int count = 0;
        int majorityElement = nums[0];
        while(i<n){
            if(nums[i]== majorityElement){
                count++;
                i++;
            }else{
                if(count==0 && nums[i]!= majorityElement){
                     majorityElement = nums[i];
                     i++;
                }else{
                    count--;
                    i++;
                }
            }
        }
     return majorityElement;
    }
}
