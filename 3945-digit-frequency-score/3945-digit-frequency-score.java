class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer,Integer> m = new HashMap<>();
        while(n!=0)
        {
            int j = n%10;
            n /=10;
            m.put(j,m.getOrDefault(j,0)+1);
        }
        int ans = 0;
        for(Map.Entry<Integer,Integer> g:m.entrySet())
        {
            ans += g.getValue()*g.getKey();
        }
        return ans;
    }
}