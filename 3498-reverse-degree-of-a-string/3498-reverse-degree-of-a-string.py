class Solution:
    def reverseDegree(self, s: str) -> int:
        a = 0
        for i in range(len(s)):
           c=s[i]
           a += (26-(ord(c)-ord('a')))*(i+1)
        return a