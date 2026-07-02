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
    private boolean tres(TreeNode root,int target,int curr)
    {  
        if(root==null)return false;
        curr+=root.val;
       if(root.left==null && root.right==null)
       {
        
         return curr==target;
       }
       return tres(root.left,target,curr) || tres(root.right,target,curr);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
       
    
    return    tres(root,targetSum,0);
       
    }
}