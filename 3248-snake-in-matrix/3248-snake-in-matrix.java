class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][] mat = new int[n][n];
        int a = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=a;
                a++;
            }
        }
        int i=0,j=0;
        for(String com : commands)
        {
           if(com.equals("RIGHT"))j++;
           if(com.equals("LEFT"))j--;
           if(com.equals("UP"))i--;
           if(com.equals("DOWN"))i++;
           
        }
        return mat[i][j];
    }
}