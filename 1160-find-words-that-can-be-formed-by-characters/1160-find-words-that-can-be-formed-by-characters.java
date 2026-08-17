class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] r = new int[26];
        int ans = 0;

        // Count characters available in chars
        for (int i = 0; i < chars.length(); i++) {
            r[chars.charAt(i) - 'a']++;
        }

        // Check every word
        for (int i = 0; i < words.length; i++) {
            int[] c = new int[26];

            for (int j = 0; j < words[i].length(); j++) {
                c[words[i].charAt(j) - 'a']++;
            }

            boolean possible = true;

            for (int j = 0; j < 26; j++) {
                if (c[j] > r[j]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                ans += words[i].length();
            }
        }

        return ans;
    }
}