public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) xor ^= num;
        int[] result = new int[2];
        int mask = xor & ~(xor-1);
        for (int num : nums) {
            if ((num & mask) != 0) result[0] ^= num;
            else result[1] ^= num;
        }
        return result;
    }
}