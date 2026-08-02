class Solution:
    def stoneGameVI(self, alice: List[int], bob: List[int]) -> int:
     n = len(alice)
     stones = []
     for i in range(n):
        stones.append((alice[i]+bob[i],i))
     stones.sort(reverse=True)
     a = 0
     b = 0
     for turn in range(n):
        index = stones[turn][1]
        if turn % 2 == 0:
            a += alice[index]
        else:
            b += bob[index]
     if a > b:
        return 1
     elif a < b:
        return -1
     else:
        return 0

