class Solution {
    public int distinctAverages(int[] nums) {
        int ans=0,n=nums.length;
        Arrays.sort(nums);
        List<Integer> avg = new ArrayList<>();
        for(int i=0;i<n/2;i++)
        {
            int a=nums[i]+nums[n-i-1]; 
            if(!avg.contains(a))
            {
                avg.add(a);
            }
        }
        return avg.size();
    }
}