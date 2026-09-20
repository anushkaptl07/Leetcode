class Solution {
  
    public boolean checkOverlap(int r, int x, int y, int x1, int y1, int x2, int y2) {
       int cX = Math.max(x1,Math.min(x,x2));
       int cY = Math.max(y1,Math.min(y,y2));
       long dx = x-cX;
       long dy = y-cY;
       return dx*dx + dy*dy <= (long)r*r;
    }

}