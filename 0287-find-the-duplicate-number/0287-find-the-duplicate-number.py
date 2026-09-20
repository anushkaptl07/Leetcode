class Solution:
    def findDuplicate(self, nums: list[int]) -> int:
        l = len(nums)
        cnt = [0]*l
        for i in range(0,l):
            cnt[nums[i]] += 1
            if cnt[nums[i]]>1:
                return nums[i]
        return l
