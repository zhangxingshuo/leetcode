public class Solution {
    public int trailingZeroes(int n) {
        // recursive
        // if (n == 0) return 0;
        // else return n / 5 + trailingZeroes(n / 5);
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}