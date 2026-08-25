class Solution {
    public int count(int n)
    {
        int ans=0;
        while(n>0)
        {
           if(n%2==1)
           {
             ans++;
           }
           n/=2;
        }
        return ans;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++)
        {
            int s = count(i);
            if(s==k)
            {
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}