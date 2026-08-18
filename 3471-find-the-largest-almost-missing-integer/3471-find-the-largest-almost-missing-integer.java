class Solution {
    public int largestInteger(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i <= nums.length - k; i++) {

            Set<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            for (int x : set) {
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
        }

        int n = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> m : freq.entrySet()) {
            if (m.getValue() == 1) {
                n = Math.max(n, m.getKey());
            }
        }

        return n == Integer.MIN_VALUE ? -1 : n;
    }
}