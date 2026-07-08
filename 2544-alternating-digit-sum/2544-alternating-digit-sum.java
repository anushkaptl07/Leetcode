class Solution {
    public int alternateDigitSum(int n) {
        if(n==9)return 9;
        int t = (int)Math.log10(n+1);
        int s = t%2==1 ? -1:1;
        t=0;
        while(n!=0)
        { 
           t+=(n%10)*s;
           s *= -1;
           n /=10;
        }
        return t;
    }
}