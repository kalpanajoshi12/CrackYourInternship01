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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return Helper(root,0,targetSum);
    }
    public boolean Helper(TreeNode root,int currentSum,int targetSum){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return currentSum+root.val==targetSum;
        }
        return Helper(root.left,currentSum+root.val,targetSum) || Helper(root.right,currentSum+root.val,targetSum);
    }
}