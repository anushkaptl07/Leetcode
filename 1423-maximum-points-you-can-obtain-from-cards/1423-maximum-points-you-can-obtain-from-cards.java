class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=k-1,r=cardPoints.length-1,sum=0,n=cardPoints.length,ans=0;
        for(int i=0;i<k;i++)
        {
            sum += cardPoints[i];
        }
        ans =sum;
        while(l>=0)
        {
            sum -= cardPoints[l];
            sum += cardPoints[r];
            ans = Math.max(ans,sum);
            l--;
            r--;
        }
        return ans;
    }
}