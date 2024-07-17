class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int[] ans = new int[2];
       for(int i = 0;i<nums.length;i++){
        int x = target-nums[i];
        if(map.containsKey(nums[i])){
            ans[0] = map.get(nums[i]);
            ans[1] = i;
        }
        map.put(x,i);
       }
       return ans;
    }
}