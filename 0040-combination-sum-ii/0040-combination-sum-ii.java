class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n = candidates.length;
        int sum = 0;
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        f(candidates,ans,0,n,sum,target,subset);
        return ans;
    }

    public void f(int [] candidates,List<List<Integer>> ans,int index,int n,int sum,int target,List<Integer> subset){
        if(sum==target){
            ans.add(new ArrayList<>(subset));
            return;
        }
        if(index >= n){
            return;
        }
        if(sum>target){
            return;
        }
        sum+=candidates[index];
        subset.add(candidates[index]);
        f(candidates,ans,index+1,n,sum,target,subset);
        sum-= candidates[index];
        subset.remove(subset.size()-1);
        while(index+1<candidates.length && candidates[index]==candidates[index+1])
            index++;
        f(candidates,ans,index+1,n,sum,target,subset);
        
    }
}