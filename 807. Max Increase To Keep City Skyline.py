class Solution(object):
    def maxIncreaseKeepingSkyline(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        row_max = [0] * len(grid[0])
        col_max = [0] * len(grid)
        
        # columns
        for i in range(len(grid)):
            col_max[i] = max([row[i] for row in grid])
        
        for i in range(len(grid[0])):
            row_max[i] = max(grid[i])
            
        total = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                total += min(col_max[i], row_max[j]) - grid[i][j]
        return total