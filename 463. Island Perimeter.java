public class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int per = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (grid[i][j] == 1) per += perimeter(grid, i, j);
            }
        }
        return per;
    }
    
    public static int perimeter(int[][] grid, int i, int j) {
        int per = 0;
        
        if (i == 0) ++per;
        else if (grid[i-1][j] == 0) ++per;
        
        if (j == 0) ++per;
        else if (grid[i][j-1] == 0) ++per;
        
        if (i == grid.length-1) ++per;
        else if (grid[i+1][j] == 0) ++per;
        
        if (j == grid[0].length-1) ++per;
        else if (grid[i][j+1] == 0) ++per;
        return per;
    }
}