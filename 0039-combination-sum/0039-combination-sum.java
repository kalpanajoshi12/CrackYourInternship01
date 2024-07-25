class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        int n = candidates.length;
        int sum = 0;
        f(candidates,0,n,sum,target,ans,subset);
        return ans;
    }
    public void f(int []candidates,int index, int n, int sum, int target,List<List<Integer>> ans,List<Integer> subset){

      if(sum == target){
        ans.add(new ArrayList<Integer>(subset));
        return;
      }
      if(index>=n){
        return;
      }
      if(sum>target){
        return;
      }
      sum+=candidates[index];
      subset.add(candidates[index]);
      f(candidates,index,n,sum,target,ans,subset);
      sum-=candidates[index];
      subset.remove(subset.size()-1);
       f(candidates,index+1,n,sum,target,ans,subset);
    }
}