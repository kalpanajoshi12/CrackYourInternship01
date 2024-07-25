class Solution {
    public int[] merge(int[] nums,int low, int mid, int high){
        int p1 = low;
        int p2 = mid+1;
        int[] temp = new int[high-low+1];
        int index = 0;
        while(p1<=mid && p2<=high){
            if(nums[p1] < nums[p2]){
                temp[index] = nums[p1];
                p1++;
                index++;
            }else{
                temp[index] = nums[p2];
                p2++;
                index++;
            }
        }
        while(p1<=mid){
            temp[index] = nums[p1];
           p1++;
           index++;
        }
         while(p2<=high){
            temp[index] = nums[p2];
            p2++;
            index++;
            
            
        }
       for(int i = 0, j=low;i<temp.length;i++, j++){
           nums[j] = temp[i];
                  }
        return nums;
    }
    public void mergesort(int[] nums, int low, int high){
        if(low>=high){
            return;
        }
        int mid = low+(high-low)/2;
        mergesort(nums,low,mid);
        mergesort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
}