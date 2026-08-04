class Solution {
    public int climbStairs(int n) {
      int n1=0,n2=1,n3=1;
      if(n<2)return n;
      for(int i=1;i<=n;i++)
      {
        n3 = n1+n2;
        n1 = n2;
        n2 = n3;
      }
      return n3;
    }
}