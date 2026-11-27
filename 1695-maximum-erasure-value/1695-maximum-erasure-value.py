class Solution:
    def maximumUniqueSubarray(self, nums: list[int]) -> int:
        arr = []
        left = 0
        sum1 = 0
        maxSum = 0

        for right in range(len(nums)):
            while nums[right] in arr:
                sum1 -= nums[left]
                arr.remove(nums[left])
                left += 1

            arr.append(nums[right])
            sum1 += nums[right]

            maxSum = max(maxSum, sum1)

        return maxSum