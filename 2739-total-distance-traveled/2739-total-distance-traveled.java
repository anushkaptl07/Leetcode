class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        if(mainTank<5)return 10*mainTank;
        int t = mainTank*10;
        int n = (mainTank-1)/4;
        n = n< additionalTank ? n:additionalTank;
        return t + n*10;
    }
}