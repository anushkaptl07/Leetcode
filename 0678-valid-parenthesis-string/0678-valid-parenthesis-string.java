class Solution {
    public boolean checkValidString(String s) {
        if(s.equals("*"))return true;
      if(s.length()==1)return false;
      int l = 0,h=0;
      for(int i=0;i<s.length();i++)
      {
        l += s.charAt(i)=='(' ? 1:-1;
        h += s.charAt(i)==')' ? -1:1;
        if(h<0)return false;
        l = Math.max(l,0);
      }
      return l==0;
    }
}