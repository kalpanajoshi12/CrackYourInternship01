class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                int absolute = Math.abs(index - i);
                if (absolute <= k) {
                    return true;
                }
            }

            map.put(nums[i], i);

        }
        return false;
    }

}