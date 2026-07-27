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
    public void Trav(TreeNode root,List<Integer> arr)
    {
        if(root==null)
        {
           return;
         }
          arr.add(root.val);
        
        Trav(root.left,arr);
        Trav(root.right,arr);
    }
    public int getMinimumDifference(TreeNode root) {
        int diff=Integer.MAX_VALUE;
       List<Integer> ans=new ArrayList<>();
       Trav(root,ans);
       Collections.sort(ans);
       for(int i=1;i<ans.size();i++)
       {
         if(Math.abs(ans.get(i)-ans.get(i-1))<diff)
         {
            diff=Math.abs(ans.get(i)-ans.get(i-1));
         }
       }
       return diff;
    }
}