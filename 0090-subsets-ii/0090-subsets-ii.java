class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        subsets(nums, 0, n, new ArrayList<Integer>(), set);
      return new ArrayList<>(set);
    }

    public void subsets(int[] nums, int index, int n, ArrayList<Integer> subset, HashSet<List<Integer>> set){
        if(index>=n){
            set.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        subsets(nums,index+1,n,subset,set);
         subset.remove(subset.size()-1);
        subsets(nums,index+1,n,subset,set);

    }
}