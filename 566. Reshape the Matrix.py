class Solution(object):
    def matrixReshape(self, nums, r, c):
        """
        :type nums: List[List[int]]
        :type r: int
        :type c: int
        :rtype: List[List[int]]
        """
        if len(nums) * len(nums[0]) != r * c:
            return nums
        
        L = []
        for num in nums:
            L.extend(num)
        
        return [L[i:i+c] for i in range(0, len(L), c)]