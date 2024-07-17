class Solution {
    public void merge(int[]nums,int start,int end){
        if(start==end){
            return;
        }
        int middle = start+(end-start)/2;
        merge(nums,start,middle);
        merge(nums,middle+1,end);
        mergeSort(nums,start,middle,end);
    }
    public void mergeSort(int nums[] ,int start,int middle,int end){
        int p1 = start;
        int p2=middle+1;
        int OutputArrayindex = 0;
        int[] OutputArray = new int[end-start+1];

        while(p1<=middle && p2<=end){
            if(nums[p1]<nums[p2]){
              OutputArray[OutputArrayindex] = nums[p1];
               p1++;
              OutputArrayindex++;
            }else{
                OutputArray[OutputArrayindex] = nums[p2];
                p2++;
              OutputArrayindex++;
            }
        }
        for(int i = p1;i<=middle;i++){
             OutputArray[OutputArrayindex] = nums[i];
             OutputArrayindex++;
        }

         for(int i = p2;i<=end;i++){
             OutputArray[OutputArrayindex] = nums[i];
             OutputArrayindex++;
        }
        for(int j=0, i=start;j<OutputArray.length;i++,j++){
            nums[i]=OutputArray[j];
        } 
    }

     public void sortColors(int[] nums) {
        int n = nums.length;
        merge(nums,0,n-1);
    }
}