public class Solution {
    public static final int NUM_BITS = 32;
    
    public int totalHammingDistance(int[] nums) {
        int total = 0, n = nums.length;
        for (int i = 0; i < NUM_BITS; ++i) {
            int bitCount = 0;
            for (int j = 0; j < n; ++j) {
                bitCount += (nums[j] >> i) & 1;
            }
            total += bitCount * (n - bitCount);
        }
        return total;
    }
}