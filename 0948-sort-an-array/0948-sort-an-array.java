class Solution {
    public void merge (int []nums,int low,int high){
      if(low==high){
        return;
      }
      int mid = low+(high-low)/2;
      merge(nums,low,mid);
      merge(nums,mid+1,high);
      mergeSort(nums,low,mid,high);
    }
    public void mergeSort(int nums[],int low,int mid,int high){
        int p1=low;
        int p2=mid+1;
        int[] outputArray= new int[high-low+1];
        int index = 0;
        while(p1<=mid && p2<=high){
            if(nums[p1]<nums[p2]){
                outputArray[index] = nums[p1];
                p1++;
                index++;
            }else{
                outputArray[index] = nums[p2];
                p2++;
                index++;
            }
        }
        while(p1<=mid){
            outputArray[index] = nums[p1];
            p1++;
            index++;
        }
        while(p2<=high){
            outputArray[index] = nums[p2];
            p2++;
            index++;
        }
        for(int i = 0,j = low;i<outputArray.length;i++,j++){
            nums[j] = outputArray[i];
        }
    }
    public int[] sortArray(int[] nums) {
        merge(nums,0,nums.length-1);
        return nums;
    }
}