class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans1 = 0, ans2 = 0, ans3 = 0;

        int n = Math.min(need1, need2);

        ans1 = (long) costBoth * n;

        if(need1 > need2)
            ans1 += (long)(need1-n) * cost1;
        else
            ans1 += (long)(need2-n) * cost2;

        ans2 = (long) need1 * cost1 + (long) need2 * cost2;

        ans3 = (long) costBoth * Math.max(need1, need2);

        return Math.min(ans1, Math.min(ans2, ans3));
    }
}