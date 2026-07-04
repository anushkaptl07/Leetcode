class Solution {
int ans = Integer.MAX_VALUE;
    public int minScore(int n, int[][] roads) {
        List<List<int[]>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++)
            adj.add(new ArrayList<>());

        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int wt = road[2];

            adj.get(u).add(new int[]{v, wt});
            adj.get(v).add(new int[]{u, wt});
        }
        boolean[] vis = new boolean[n + 1];

        dfs(1, adj, vis);

        return ans;
    }
    void dfs(int node, List<List<int[]>> adj, boolean[] vis) {

        vis[node] = true;

        for (int[] it : adj.get(node)) {

            ans = Math.min(ans, it[1]);

            if (!vis[it[0]]) {
                dfs(it[0], adj, vis);
            }
        }
    }
}