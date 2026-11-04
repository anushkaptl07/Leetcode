class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);

        int ans = 0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != 0)
            {
                if(i == 0 || nums[i] != nums[i-1])
                {
                    ans++;
                }
            }
        }

        return ans;
    }
}