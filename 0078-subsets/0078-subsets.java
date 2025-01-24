class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int length = nums.length;
        for(int n=0 ;n < (1 << length);n++){
            ArrayList<Integer> arraylist = new ArrayList<>();
            for(int i = 0;i < length;i++){
                if((n & (1 << i)) > 0){
                    arraylist.add(nums[i]);
                }
            }
            ans.add(arraylist);
        }
        return ans;
    }
}