class Solution {
    public int differenceOfSum(int[] nums) {
        int d =0,e=0;
        for(int i:nums)
        {
            e += i;
            while(i!=0)
            {
                d += i%10;
                i /= 10;
            }
        }
        return Math.abs(e-d);
    }
}