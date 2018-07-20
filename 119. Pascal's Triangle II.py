class Solution(object):
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        """
        return [self.choose(rowIndex, i) for i in range(rowIndex+1)]
        
    def choose(self, n, k):
        return math.factorial(n) / (math.factorial(n-k) * math.factorial(k))