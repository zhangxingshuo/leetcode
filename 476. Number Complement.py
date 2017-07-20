class Solution(object):
    def findComplement(self, num):
        """
        :type num: int
        :rtype: int
        """
        count = 0
        res = 0
        while num > 0:
            if not (num & 0x1):
                res += (2**count)
            num >>= 1
            count += 1
        return res