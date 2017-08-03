public class Solution {
    public int minDistance(String word1, String word2) {
        // dynamic programming
        int n = word1.length();
        int m = word2.length();
        int[][] dist = new int[n+1][m+1];
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= m; ++j) {
                // if either string empty, need to insert every char of other string
                if (i == 0) dist[i][j] = j;
                else if (j == 0) dist[i][j] = i;
                
                // if chars are equal, no edit necessary
                else if (word1.charAt(i-1) == word2.charAt(j-1)) dist[i][j] = dist[i-1][j-1];
                
                // take the min of replacement, insertion, and deletion
                else {
                    int rep = dist[i-1][j-1];
                    int ins = dist[i][j-1];
                    int del = dist[i-1][j];
                    dist[i][j] = 1 + (rep < ins ? (rep < del ? rep : del) : (ins < del ? ins : del));
                }
            }
        }
        return dist[n][m];
    }
}
