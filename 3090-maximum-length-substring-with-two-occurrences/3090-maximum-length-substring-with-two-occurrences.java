class Solution {

    public int maximumLengthSubstring(String s) {
      int l = 0;
      for(int i=0;i<s.length();i++)
      {
        int[] alpha = new int[26];
        for(int j=i;j<s.length();j++)
        {
             int ch = s.charAt(j)-'a';
             alpha[ch]++;
             if(alpha[ch]>2)
             {
                break;
             } 
             l =Math.max(l,j-i+1);
            
        }
      }   
      return l;
    }
}