class Solution {
    public int[] numberOfPairs(int[] nums) {
        int pair=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j] && nums[i]!=-1 && nums[j]!=-1)
                {
                   pair++;
                   nums[i]=-1;
                   nums[j]=-1;
                }
            }
        }
        int[] ans = new int[2];
        ans[0]=pair;
        ans[1]=nums.length-2*pair;
        return ans;
    }
}