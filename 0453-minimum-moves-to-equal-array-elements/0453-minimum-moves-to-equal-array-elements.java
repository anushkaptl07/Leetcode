class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;

        for(int i = 0; i < n; i++) {
            ans += nums[i] - nums[0];
        }

        return ans;
    }
}