class Solution(object):
    def addStrings(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        maxlen = max(len(num1), len(num2))
        if len(num1) > len(num2):
            num2 = num2.zfill(maxlen)
        elif len(num2) > len(num1):
            num1 = num1.zfill(maxlen)
            
        res = 0
        for i in range(maxlen):
            res += 10**i * (int(num1[maxlen-i-1]) + int(num2[maxlen-i-1]))
        return str(res)