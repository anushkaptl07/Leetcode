class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] i:invocations)
        {
           adj.get(i[0]).add(i[1]);
        }
        int[] remove = new int[n];

        Arrays.fill(remove,0);
        Queue<Integer> q = new LinkedList<>();
        remove[k]=1;
        q.offer(k);
        while(!q.isEmpty())
        {
            int curr = q.poll();
            for(int i:adj.get(curr))
            {
                if(remove[i]==0){
              remove[i]=1;
              q.offer(i);
                }
            }
        }
        List<Integer> curr = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            if(remove[i]==0)
            {
               curr.add(i);
            }
           
        }
        boolean d = true;
        for(int i:curr)
        {
            for(int j:adj.get(i))
            {
                if(remove[j]==1)
                {
                    d=false;
                    break;
                }
            }
        }
        if( d==true)return curr;
        List<Integer> ui = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ui.add(i);
        }
        return ui;
    }
}
