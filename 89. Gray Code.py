class Solution:
    def grayCode(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        return [int(x, 2) for x in self.binary_helper(n - 1)]
    
    def binary_helper(self, n):
        if n == -1:
            return ["0"]
        if n == 0:
            return ["0", "1"]
        else:
            prev = self.binary_helper(n - 1)
            zeros = ["0" + x for x in prev]
            ones = ["1" + x for x in prev[::-1]]
            return zeros + ones