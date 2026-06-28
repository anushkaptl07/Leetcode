class Solution {
   private void bfs(int[][] graph,int[] visit,int curr)
   {
       visit[curr]=1;
       for(int i=0;i<graph.length;i++)
       {
         if(graph[curr][i]==1 && visit[i]!=1)
         {
            bfs(graph,visit,i);
         }
       }
   }
    public int findCircleNum(int[][] isConnected) {
       int ans=0;
       int[] visit = new int[isConnected.length];
       Arrays.fill(visit,0);
       for(int i=0;i<isConnected.length;i++)
       {
         if(visit[i]!=1)
         {
            ans++;
            bfs(isConnected,visit,i);
         }
       }
       return ans;
    }
}