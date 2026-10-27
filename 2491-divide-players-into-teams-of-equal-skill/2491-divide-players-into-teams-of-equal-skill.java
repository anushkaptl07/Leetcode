class Solution {
    public long dividePlayers(int[] skill) {
     
        long ans = 0;
        if(skill.length==2)
        {
            return (long)skill[0]*skill[1];
        } 
        Arrays.sort(skill);
        int n = skill.length;
        int s = skill[0]+skill[n-1],i=1,j=n-2;
        ans += skill[0]*skill[n-1];
        while(i<j)
        {
            if(skill[i]+skill[j]!=s)return -1;
            ans += skill[i]*skill[j];
            i++;
            j--;
        }
        return ans;
    }
}