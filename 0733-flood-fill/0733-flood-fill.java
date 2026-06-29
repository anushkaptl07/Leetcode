class Solution {
    class Pair
    {
        int x,y;
        public Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    public void bfs(int[][]image,int sr,int sc,int color,int[]dx,int[]dy,int old)
    {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(sr,sc));
        while(!q.isEmpty())
        {
            Pair curr = q.poll();
            
            for(int i=0;i<4;i++)
            {
                int cx = curr.x+dx[i];
                int cy = curr.y+dy[i];
                if(cx>=0 && cy>=0 && cx<image.length && cy<image[0].length && image[cx][cy]!=color && image[cx][cy]==old)
                {
                    image[cx][cy]=color;
                    q.offer(new Pair(cx,cy));
                }
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)return image;
        int old = image[sr][sc];
        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};
        image[sr][sc]=color;
        bfs(image,sr,sc,color,dx,dy,old);
        return image;
    }
}