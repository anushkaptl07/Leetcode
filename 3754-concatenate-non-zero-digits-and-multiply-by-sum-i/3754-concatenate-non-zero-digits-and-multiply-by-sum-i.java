class Solution {
    public long sumAndMultiply(int n) {
        long ans = 0;
        int y=0,curr=0;
        while(n!=0)
        {
            if(n%10!=0)
            {
                ans += (n%10)*Math.pow(10,curr);
                y+=n%10;
                curr++;
            }
             n/=10;
        }
        return ans*y;
    }
}