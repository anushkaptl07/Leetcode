class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int s=0;
        int[] ans = new int[queries.length];
        for(int i:nums)
        {
            if(i%2==0)s+=i;
        }
        int j=0;
        for(int[]q:queries)
        {
            int h = nums[q[1]];
            nums[q[1]]+=q[0];
            if(h%2==0)
            {
                s-=h;
            }
            if (nums[q[1]]%2==0)
            {
                s+=nums[q[1]];
            }
            ans[j]=s;
            j++;
        }
        return ans;
    }
}