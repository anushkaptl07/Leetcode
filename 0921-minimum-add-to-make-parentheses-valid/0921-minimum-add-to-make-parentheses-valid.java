class Solution {
    public int minAddToMakeValid(String s) {
        int o = 0,d=0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                o++;
            } else {
               
                if (o > 0) {
                    o--;
                } else {
                    d++;
                }
            }
        }
        return o+d;
    }

}