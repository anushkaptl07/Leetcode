class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int MOD = 1_000_000_007;
        int n = s.length();

        long[] prefixSum = new long[n + 1];
        long[] prefixNum = new long[n + 1];
        long[] count = new long[n + 1];
        long[] pow = new long[n + 1];

        pow[0] = 1;
        
        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';

            prefixSum[i + 1] = prefixSum[i] + digit;
            prefixNum[i + 1] = prefixNum[i];
            count[i + 1] = count[i];
            pow[i + 1] = (pow[i] * 10) % MOD;

            if (digit != 0) {
                prefixNum[i + 1] =
                    (prefixNum[i] * 10 + digit) % MOD;
                count[i + 1]++;
            }
        }

        int[] ans = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int l = queries[q][0];
            int r = queries[q][1];

            long sum = prefixSum[r + 1] - prefixSum[l];

          int len = (int)(count[r + 1] - count[l]);

            long num = (prefixNum[r + 1]
                    - (prefixNum[l] * pow[len]) % MOD + MOD) % MOD;

            ans[q] = (int) ((num * sum) % MOD);
        }

        return ans;
    }
}