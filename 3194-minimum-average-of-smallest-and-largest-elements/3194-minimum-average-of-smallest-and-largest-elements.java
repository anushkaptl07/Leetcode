class Solution {
    public double minimumAverage(int[] nums) {
       double ans=Integer.MAX_VALUE;
       int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n/2;i++)
        {
            double a=nums[i]+nums[n-i-1];
            if(a<ans)ans=a;
        }
        return ans/2;
    }
}