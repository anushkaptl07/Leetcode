class Solution {
    public void generate(String s,List<String> ans,int n)
    {
        if(s.length()==n)
        {  ans.add(s);
            return;}
        if(s.length()==0 )
        {
            generate(s+'1',ans,n);
            generate(s+'0',ans,n);
        }
        else if( s.charAt(s.length()-1)=='1')
        {
           generate(s+'1',ans,n);
            generate(s+'0',ans,n);
        }
        else
        {
           generate(s + '1', ans, n); 
        }

    }
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        generate("",ans,n);
        return ans;
    }
}