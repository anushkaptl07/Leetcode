class Solution {
    public String customSortString(String order, String s) {
        int[] f = new int[s.length()];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<order.length();i++)
        {
            char ch = order.charAt(i);
             for(int j=0;j<s.length();j++)
             {
               if(ch==s.charAt(j))
               {
                f[j]=1;
                sb.append(ch);
               }
             }
        }
         for(int j=0;j<s.length();j++)
         {
            if(f[j]!=1)
            {
                sb.append(s.charAt(j));
            }
         }
         return sb.toString();
    }
}