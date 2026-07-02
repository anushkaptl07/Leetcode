class Solution {

    private void path(TreeNode root, int target, int curr,
                      List<Integer> currPath,
                      List<List<Integer>> ans) {

        if (root == null) return;

        curr += root.val;
        currPath.add(root.val);

        if (root.left == null && root.right == null) {
            if (curr == target) {
                ans.add(new ArrayList<>(currPath));
            }
        } else {
            path(root.left, target, curr, currPath, ans);
            path(root.right, target, curr, currPath, ans);
        }

        // Backtrack
        currPath.remove(currPath.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currPath = new ArrayList<>();

        path(root, targetSum, 0, currPath, ans);

        return ans;
    }
}