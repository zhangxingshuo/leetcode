class Solution(object):
    def findMaxAverage(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: float
        """
        s = res = sum(nums[0:k])
        for i in range(k, len(nums)):
            s += nums[i] - nums[i - k]
            res = max(res, s)
        return 1.0 * res / k