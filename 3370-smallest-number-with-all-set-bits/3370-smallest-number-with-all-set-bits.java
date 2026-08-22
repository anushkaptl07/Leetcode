class Solution {
    public int smallestNumber(int n) {
        int d = (int)(Math.log(n)/Math.log(2))+1;
        
        return (int)(Math.pow(2,d))-1;
    }
}