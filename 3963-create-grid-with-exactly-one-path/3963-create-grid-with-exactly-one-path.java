class Solution {
    public String[] createGrid(int m, int n) {
       
      String[][] ans = new String[m][n];
      String[] a = new String[m];
      String base = "";
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
            ans[i][j]="#";
        } 
      }  
      ans[0][0]=".";
      for(int i=0;i<n;i++)
      {
        ans[0][i]=".";
      }
      for(int j=1;j<m;j++)
      {
        ans[j][n-1]=".";
      }
      for(int i=0;i<m;i++)
      {
        String s = "";
        for(int j=0;j<n;j++)
        {
           s += ans[i][j];
        }
        a[i]=s;
      }
       return a;
    }
}