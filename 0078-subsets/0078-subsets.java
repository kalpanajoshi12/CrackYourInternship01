class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        f(0,new ArrayList<Integer>(),nums,res);
        return res;
    }
    public void f(int index,List<Integer>sub,int[] arr,List<List<Integer>>result){
        result.add(new ArrayList<>(sub));
        for(int i = index;i<arr.length;i++){
             sub.add(arr[i]);
             f(i+1,sub,arr,result);
             sub.remove(sub.size()-1);
        }
    }
}