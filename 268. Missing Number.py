class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = len(nums)
        total = n * (n+1) / 2
        for num in nums:
            total -= num
        return total