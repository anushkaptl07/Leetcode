class Solution:
    def countIntersectingIntervals(self, intervals: list[list[int]]) -> int:
        ans = 0
        for i in range(0,len(intervals)):
            for j in range((i+1),len(intervals)):
                if intervals[i][0]<=intervals[j][1] and intervals[j][0]<=intervals[i][1]:
                    ans += 1
                
        return ans