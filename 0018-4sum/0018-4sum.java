class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums==null || nums.length<4){
            return new ArrayList<>();
        }

        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i<n-3;i++){
            for(int j = i+1;j<n-2;j++){
                int k = j+1;
                int l = nums.length-1;
                while(k<l){
                    long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                    }else if(sum<=target){
                        k++;
                    }else if(sum>target){
                        l--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}