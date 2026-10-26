class Solution {
    int[] dirX = {-1,0,1,0};
    int[] dirY = {0,1,0,-1};
    public void bfs(int cx,int cy,int[][] visit,List<Long> island,int[][]grid)
    {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{cx,cy});
        long arr = 0;
        while(!q.isEmpty())
        {
            int[] curr = q.poll();
            int x = curr[0],y=curr[1];
            arr += grid[x][y];
            for(int i=0;i<4;i++)
            {
                int nx = dirX[i]+x;
                int ny = dirY[i]+y;
                if(nx>=0 && nx<grid.length && ny>=0 && ny <grid[0].length && grid[nx][ny]>0 && visit[nx][ny]==0)
                {
                    visit[nx][ny]=1;
                    q.offer( new int[]{nx,ny});
                }
            }
        }
        island.add(arr);
    }
    public int countIslands(int[][] grid, int b) {
        int[][] visit = new int[grid.length][grid[0].length];
       List<Long> island = new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]!=0 && visit[i][j]==0)
                {
                    visit[i][j]=1;
                    bfs(i,j,visit,island,grid);
                }
            }
        }
    
        long ans = 0;
        for(long k:island)
        {
            if(k%b==0)
            {
                ans++;
            }
        }
        return (int)ans;
    }
}