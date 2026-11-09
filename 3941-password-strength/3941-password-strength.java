class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> dup = new HashSet<>();
        for(int i=0;i<password.length();i++)
        {
            dup.add(password.charAt(i));
        }
        
        int ans  = 0;
        for(Character ch:dup)
        {
           if(ch>='a' && ch<='z')ans++;
           else if(ch>='A' && ch<='Z')ans+=2;
           else if(ch>='0' && ch<='9')ans+=3;
           else{
            ans+=5;
           }
        
        }
        return ans;
    }
}