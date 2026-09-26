class Solution {

    int[] nums;
    int[] original;

    public Solution(int[] nums) {
        this.nums = nums;
        this.original = nums.clone();
    }
    
    public int[] reset() {
        this.nums = original.clone();
        return nums;
    }
    
    public int[] shuffle() {
        for(int i=0;i<nums.length;i++)
        {
            int j = (int)(Math.random() * nums.length);

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        return nums;
    }
}