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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode >();
        if(root==null){
            return list;
        }
        queue.add(root);
        boolean isZigZag = false;
        while(!queue.isEmpty()){
            LinkedList<Integer> level = new LinkedList<>();
            int count = queue.size();
            while(count>0){
            TreeNode node = queue.remove();
            count--;
            if(isZigZag){
                level.add(0,node.val);
            }else{
                level.add(node.val);
            }
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
       list.add(level);
       isZigZag = !isZigZag;    
            
    }
    return list;
    }
}