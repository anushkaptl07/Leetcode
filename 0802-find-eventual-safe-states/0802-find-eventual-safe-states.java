class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
      List<List<Integer>> adj = new ArrayList<>();
      int n = graph.length;
      int[] indegree = new int[n];
      for(int i=0;i<n;i++)
      {
        adj.add(new ArrayList<>());
      }
      for(int i=0;i<graph.length;i++)
      {
         for(int node:graph[i])
         {
            adj.get(node).add(i);
            indegree[i]++;
         }
      }        
      Queue<Integer> q = new LinkedList<>();
      for(int i=0;i<n;i++)
      {
        if(indegree[i]==0)q.add(i);
      }
      boolean[] safe = new boolean[n];
      while(!q.isEmpty())
      {
        int curr = q.poll();
        safe[curr]=true;
        for(int neighbour:adj.get(curr))
        {
            indegree[neighbour]--;
            if(indegree[neighbour]==0)
            {
                q.add(neighbour);
            }
        }
      }
      List<Integer> safeNodes = new ArrayList<>();
      for(int i=0;i<n;i++)
      {
        if(safe[i])
        {
            safeNodes.add(i);
        }
      }
      return safeNodes;
    }
}