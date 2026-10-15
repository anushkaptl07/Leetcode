class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans =0;
        for(int i=0;i<nums.size();i++)
        {
            Set<Integer> s = new HashSet<>();
            for(int j=i;j<nums.size();j++)
            {
                s.add(nums.get(j));
                int d = s.size();
                ans += d*d;
            }
        }
        return ans;
    }
}