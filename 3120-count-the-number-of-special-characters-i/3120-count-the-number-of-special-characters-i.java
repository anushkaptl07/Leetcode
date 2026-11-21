class Solution {
    public int numberOfSpecialChars(String s) {
      int[] small = new int[26];
        int[] big = new int[26];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                small[s.charAt(i)-'a']++;
            }
             if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            {
                big[s.charAt(i)-'A']++;
            }
        }
        int ans=0;
        for(int i=big.length-1;i>=0;i--)
        {
            if(small[i]>0 && big[i]>0)
            {
                
                ans++;
            }
        }
        return ans;  
    }
}