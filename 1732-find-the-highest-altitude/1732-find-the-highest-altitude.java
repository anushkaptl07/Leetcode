class Solution {
    public int largestAltitude(int[] gain) {
        int curr=0;
        int high=curr;
        for(int i=0;i<gain.length;i++)
        {
            curr +=gain[i];
            high = Math.max(high,curr);
        }
        return high;
    }
}