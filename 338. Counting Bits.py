class Solution(object):
    def countBits(self, num):
        """
        :type num: int
        :rtype: List[int]
        """
        # dynamic programming
        L = [0]*(num+1)
        for i in range(1, num+1):
            # add one to total count if odd, zero otherwise
            L[i] = L[i >> 1] + i % 2
        return L
