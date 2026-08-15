class Solution {
    public int[] circularGameLosers(int n, int k) {
        int[] visit = new int[n];
        int chance=0,l=1,j=0;
        while(true)
        {
           visit[chance]++;
           if(visit[chance]==2)
           {
             break;
           } 
           chance = (chance + (k * l)) % n;
            l++;
        }
        List<Integer> ans = new ArrayList<>(); 
        for(int i=0;i<n;i++)
        {
            if(visit[i]==0)
            {
                ans.add(i+1);
            }
        }
        int[] s = new int[ans.size()];
        for(int i:ans)
        {
            s[j]=i;
            j++;
        }
        return s;
    }
}