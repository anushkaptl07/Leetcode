class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long add = 0,ans=0;
        for(int i=0;i<Math.floor(nums.length/2);i++)
        {
           add+=nums[i];
        }

        for(int i=nums.length/2;i<nums.length;i++)
        {
            ans+=nums[i];
        }
        return ans-add;
    }
}