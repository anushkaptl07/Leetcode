class Solution {
    public int[] findOrder(int V, int[][] course) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<course.length;i++)
        {
            adj.get(course[i][1]).add(course[i][0]);
        }
        int[] indegree = new int[V];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++)
        {
           for(int it:adj.get(i))
           {
              indegree[it]++;
           }     
        }
        for(int i=0;i<V;i++)
        {
            if(indegree[i]==0)
            q.offer(i);
        }
        List<Integer> topo = new ArrayList<>();
        while(!q.isEmpty())
        {
           int curr = q.poll();
           topo.add(curr);
           for(int it:adj.get(curr))
           {
            indegree[it]--;
            if(indegree[it]==0)
            {
                q.offer(it);
            }
           }
        }
        if(topo.size()!=V)return new int[]{};
        int[] ans = new int[V];
        int p=0;
        for(int i:topo)
        {
            ans[p]=i;
            p++;
        }
        return ans;

    }
}