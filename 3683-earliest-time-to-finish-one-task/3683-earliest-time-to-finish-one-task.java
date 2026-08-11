class Solution {
    public int earliestTime(int[][] tasks) {
        int n = tasks[0][0]+tasks[0][1];
        for(int[] num:tasks)
        {
            int k = num[0]+num[1];
            if(k<n)
            {
                n=k;
            }
        }
        return n;
    }
}