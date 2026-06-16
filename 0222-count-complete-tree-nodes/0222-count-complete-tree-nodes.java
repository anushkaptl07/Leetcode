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
    private void Trversal(TreeNode root,List<Integer> ss)
    {
        if(root==null)return;
        ss.add(root.val);
        if(root.left!=null)Trversal(root.left,ss);
        if(root.right!=null)Trversal(root.right,ss);
    }
    public int countNodes(TreeNode root) {
        List<Integer> ss= new ArrayList<>();
        Trversal(root,ss);
        return ss.size();
    }
}