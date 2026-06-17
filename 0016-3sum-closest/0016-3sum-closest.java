class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
       int n = nums.length;
       int r1 = nums[0]+nums[1]+nums[2];
       for(int i=0;i<n-2;i++)
       {
         int l=i+1,r=n-1;
         while(l<r)
         {
            int s=nums[i]+nums[l]+nums[r];
            if(Math.abs(target-s)<Math.abs(target-r1))
            {
                r1=s;
            }
            if(s==target)return s;
            else if(s<target)l++;
            else r--;
         }
       } 
       return r1;
    }
}