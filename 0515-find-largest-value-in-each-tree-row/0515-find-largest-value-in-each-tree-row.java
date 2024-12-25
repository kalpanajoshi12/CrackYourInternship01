/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(root==null){
            return arr;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int max;
        while(!queue.isEmpty()){
            int level = queue.size();
            max=Integer.MIN_VALUE;
            for(int i = 0;i<level;i++){
                TreeNode current = queue.poll();
                if(current.val>max){
                    max = current.val;
                }
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
            }
            arr.add(max);
            
        }
        return arr;
    }
}