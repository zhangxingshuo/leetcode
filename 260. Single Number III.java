public class Solution {
    public int[] singleNumber(int[] nums) {
        // xor contains unique bits of both numbers
        int xor = 0;
        for (int num : nums) xor ^= num;
        int[] result = new int[2];
        // mask contains least significant set bit of xor
        int mask = xor & ~(xor-1);
        for (int num : nums) {
            // divide numbers into those with set bit
            if ((num & mask) != 0) result[0] ^= num;
            // and those without
            else result[1] ^= num;
        }
        return result;
    }
}
