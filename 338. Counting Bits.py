class Solution(object):
    def countBits(self, num):
        """
        :type num: int
        :rtype: List[int]
        """
        L = [0]*(num+1)
        for i in range(1, num+1):
            L[i] = L[i >> 1] + i % 2
        return L