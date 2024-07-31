class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> Min_queue = new PriorityQueue<>();
      for(int i : nums){
        Min_queue.add(i);
        if(Min_queue.size()>k){
            Min_queue.poll();
        }
      }  
   
     return  Min_queue.poll();
    }
}