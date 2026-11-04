class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i:nums)
        {
            hash.add(i);
        }
        return hash.size()<nums.length;
    }
}