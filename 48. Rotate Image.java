public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // int[][] newMatrix = new int[n][n];
        // for (int i = 0; i < n; ++i) {
        //     for (int j = 0; j < n - i; ++j) {
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[n-j-1][i];
        //         matrix[n-j-1][i] = temp;
        //     }
        // }
        // for (int i = 0; i < n; ++i) {
        //     for (int j = 0; j < n; ++j) {
        //         matrix[i][j] = newMatrix[i][j];
        //     }
        // }
        
        // transpose
        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // reverse rows
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n / 2; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}