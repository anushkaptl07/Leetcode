class Solution {
    public int countAsterisks(String s) {
        int ans = 0, count = 0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='|')
            {
                count++;
            }
            else if(s.charAt(i)=='*' && count%2==0)
            {
                ans++;
            }
        }
        return ans;
    }
}