class Solution {
    public int minChanges(String s) {
        char curr = s.charAt(0);
        int c = 0,min =0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==curr)
            {
                c++;
                continue;
            }
            if(c%2==0)c=1;
            else{
                c=0;
                min++;
            }
            curr = s.charAt(i);
        }
        return min;

    }
}