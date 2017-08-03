public class Solution {
    public int numSquares(int n) {
        // dynamic programming
        int[] arr = new int[n+1];
        Arrays.fill(arr, n+1);
        arr[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            int s = 1;
            while (s*s <= i) {
                arr[i] = Math.min(arr[i], 1 + arr[i - s*s]);
                s++;
            }
        }
        return arr[n];
    }
}
