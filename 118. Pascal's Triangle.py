class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        if numRows == 0:
            return []
        
        res = [[1]]
        for i in range(numRows-1):
            lastrow = res[-1]
            newrow = [1]
            for i in range(1,len(lastrow)):
                newrow += [lastrow[i-1] + lastrow[i]]
            newrow += [1]
            res += [newrow]
        return res