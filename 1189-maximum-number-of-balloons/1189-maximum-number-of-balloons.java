class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] balon = new int[5];
        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i)=='b')
            {
                balon[0]++;
            }
            else if(text.charAt(i)=='a')
            {
                balon[1]++;
            }
            else if(text.charAt(i)=='l')
            {
                balon[2]++;
            }
            else if(text.charAt(i)=='o')
            {
                balon[3]++;
            }
            else if(text.charAt(i)=='n')
            {
                balon[4]++;
            }
        }
        int m =Integer.MAX_VALUE;
        balon[2]/=2;
        balon[3]/=2;
        for(int i=0;i<5;i++)
        {
            if(balon[i]<m)
            {
                m=balon[i];
            }
        }
        return m;
    }
}