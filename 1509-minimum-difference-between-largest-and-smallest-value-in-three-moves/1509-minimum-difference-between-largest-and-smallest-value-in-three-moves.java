class Solution {
    public int minDifference(int[] nums) {
       
        if(nums.length<=4)return 0;
        Arrays.sort(nums);
        
        int minDiff = Integer.MAX_VALUE;
      
       for(int i=0,j=nums.length-4;i<4;i++,j++)
       {
         minDiff = Math.min(minDiff,nums[j]-nums[i]);
       }
      return minDiff;
    }
}