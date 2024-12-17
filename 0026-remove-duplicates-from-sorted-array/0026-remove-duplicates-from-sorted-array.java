class Solution {
    public int removeDuplicates(int[] nums) {
   int i = 0;
   int j = 1;
   while(i<j && j<nums.length){
    if(nums[i]!=nums[j]){
        int temp = nums[i+1];
        nums[i+1]=nums[j];
        nums[j] = temp;
        i++;
        j++;
    }else if(nums[i]==nums[j]){
        j++;
    }
   }
   return i+1;
    }
     
}