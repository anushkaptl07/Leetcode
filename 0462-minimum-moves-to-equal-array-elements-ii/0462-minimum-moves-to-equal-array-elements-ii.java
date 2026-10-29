class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length,s=0,ans=0;
        Arrays.sort(nums);
        s = nums[n/2];
        for(int i=0;i<n;i++)
        {
           ans+=Math.abs(nums[i]-s);
        }
        return ans;
    }
}