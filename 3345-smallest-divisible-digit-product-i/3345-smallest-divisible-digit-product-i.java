class Solution {
    public int product(int n)
    {
        int r = 1;
        while(n!=0)
        {
            r *= n%10;
            n /= 10;
        }
        return r;
    }
    public int smallestNumber(int n, int t) {
       
       int g=n;
        while(true)
        {
            if(product(g)%t==0)
            {
                return g;
            }
            g++;
        }

    }
}