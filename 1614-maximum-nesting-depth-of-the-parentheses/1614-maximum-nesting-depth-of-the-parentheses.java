class Solution {
    public int maxDepth(String s) {
        int m =0,curr=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                curr++;
            }
            if(s.charAt(i)==')')
            {
                curr--;
            }
            if(curr>m)
            {
                 m = curr;
            }
        }
        return m;
    }
}