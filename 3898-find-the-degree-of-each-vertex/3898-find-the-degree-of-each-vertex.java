class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] ans = new int[matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
             int t=0;
            for(int j=0;j<matrix[i].length;j++)
            {
              if(matrix[i][j]==1)t++;
            }
            ans[i]=t;
        }
        return ans;
    }
}