class Solution {
    public int majorityElement(int[] nums) {
        int value = 1;
        int majorityElement = nums[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                if((map.get(nums[i]))>value){
                    value=map.get(nums[i]);
                    majorityElement=nums[i];
                }
            }else{
                map.put(nums[i],1);
            }
        }
        return majorityElement;
    }
}