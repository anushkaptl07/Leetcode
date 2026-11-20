class Solution {
    
    public int[][] sortTheStudents(int[][] score, int k) {
        int[][] toSort = new int[score.length][2];
        for(int i=0;i<score.length;i++)
        {
            toSort[i][0]=i;
            toSort[i][1]=score[i][k];
        }
        Arrays.sort(toSort, (a, b) -> Integer.compare(b[1], a[1]));
        int[][] ans = new int[score.length][score[0].length];
        for(int i=0;i<toSort.length;i++)
        { 
          ans[i]=score[toSort[i][0]];    
        }
        return ans;
    }
}