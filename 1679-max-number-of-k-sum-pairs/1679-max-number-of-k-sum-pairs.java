class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1,ans=0;
        while(j>=0 && nums[j]>k)
        {
            j--;
        }
        while(i<j)
        {
            if(nums[i]+nums[j]==k)
            {
                i++;
                j--;
                ans++;
            }
            else if(nums[i]+nums[j]>k)
            {
              j--;
            }
            else if(nums[i]+nums[j]<k)
            {
              i++;
            }
        }
        return ans;
    }
}