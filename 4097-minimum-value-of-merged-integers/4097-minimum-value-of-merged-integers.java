class Solution {
    public int minMergedInteger(int[] nums) {
        int m = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length - 1; i += 2) {
            int n = (int)(Math.log10(nums[i+1]) + 1);
            int k = nums[i] * (int)Math.pow(10,n) + nums[i+1];

            if(k < m) m = k;
        }

        return m;
    }
}