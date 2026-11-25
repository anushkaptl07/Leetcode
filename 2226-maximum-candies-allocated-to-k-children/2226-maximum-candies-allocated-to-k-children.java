class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max = 0;

        for(int i : candies)
        {
            max = Math.max(max, i);
        }

        int low = 1;
        int high = max;
        int o = 0;

        while(low <= high)
        {
            int mid = low + (high-low)/2;

            long c = 0;

            for(int j=0;j<candies.length;j++)
            {
                c += candies[j]/mid;
            }

            if(c >= k)
            {
                o = mid;
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }

        return o;
    }
}