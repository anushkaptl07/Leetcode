class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
       int ans=-1;
       int minDist = Integer.MAX_VALUE;
        for(int i=0;i<drones.length;i++)
        {
            int[] curr=drones[i];
            int dist = Math.abs(target[0]-curr[0])+Math.abs(target[1]-curr[1]);
            if(dist<=curr[2] && dist < minDist){
                ans=i;
                 minDist = dist;
            }
         
        }   
       
        return ans;
    }
}