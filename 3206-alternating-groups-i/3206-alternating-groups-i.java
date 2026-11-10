class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length,ans=0;
        for(int i=0;i<n;i++)
        {
          if(colors[(i+1)%n]!=colors[i] && colors[(n+i-1)%n]!=colors[i])
          {
            ans++;
          }
        }
        return ans;
    }
}