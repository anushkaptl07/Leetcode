class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int m = costs.length,i=0,ans=0;
        Arrays.sort(costs);
        while(i<m && coins>0)
        {
            
            if(coins>=costs[i])
            {
                coins -= costs[i];
                ans++;
            }
            i++;
        }
        return ans;
    }
}