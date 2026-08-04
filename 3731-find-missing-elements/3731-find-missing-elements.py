class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        min = nums[0]
        max = nums[0]
        for i in range(1,len(nums)):
            if nums[i]>max:
                max = nums[i]
            if nums[i]<min:
                min = nums[i]
        arr=[0]*(max-min+1)
        for i in nums:
            arr[i-min]=1
        ans = []
        for i in range(0,max-min):
            if arr[i] == 0:
              ans.append(min+i)
         
        return ans

        
